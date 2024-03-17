The objective for this week is implement a simple Android app that consumes a web service. Use the backend that you have programmed for the definition of the service:

http://localhost:8080/swagger/

For this task, I recommend follow the following tutorials covering Retrofit and RecyclerView:

http://www.vogella.com/tutorials/AndroidRecyclerView/article.html

This other one also applies to non-Android Java projects:

http://www.vogella.com/tutorials/Retrofit/article.html

Be careful with the gradle configuration:

you have to modify the app gradle not the project one.
the version of com.android.* packages should be the same, i.e you cannot mix versions from the code pre-generated with Android Studio and the ones from the example.
some gradle keywords have been deprecated and should be changed, i.e compile vs implementation
After doing the tutorials you have to implement an app that consumes the Tracks service and has the following feature:

Show a list of the tracks stored in the service. Use a RecyclerView for the list.
Be able to add new tracks to the system.
When a specific track in the list is tap, open a new activity when its fields can be edited.
Be able to remove an existing track to the system.
