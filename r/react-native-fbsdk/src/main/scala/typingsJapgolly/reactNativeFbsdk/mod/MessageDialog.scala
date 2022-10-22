package typingsJapgolly.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageDialog {
  
  @JSImport("react-native-fbsdk", "MessageDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the dialog can be shown.
    */
  inline def canShow(shareContent: ShareContent): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canShow")(shareContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Sets whether or not the native message dialog should fail when it encounters a data error.
    */
  inline def setShouldFailOnDataError(shouldFailOnDataError: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setShouldFailOnDataError")(shouldFailOnDataError.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Shows the dialog using the specified content.
    */
  inline def show(shareContent: ShareContent): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(shareContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
