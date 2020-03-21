package typingsJapgolly.firebaseApp

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.firebaseApp.firebaseAppLiteMod.FirebaseAppLiteImpl
import typingsJapgolly.firebaseApp.firebaseAppMod.FirebaseAppImpl
import typingsJapgolly.firebaseAppTypes.mod.FirebaseAppConfig
import typingsJapgolly.firebaseAppTypes.mod.FirebaseOptions
import typingsJapgolly.firebaseAppTypes.privateMod.FirebaseNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/app/dist/packages/app/src/firebaseNamespaceCore", JSImport.Namespace)
@js.native
object firebaseNamespaceCoreMod extends js.Object {
  def createFirebaseNamespaceCore(
    firebaseAppImpl: Instantiable3[
      /* options */ FirebaseOptions, 
      /* config */ FirebaseAppConfig, 
      /* firebase_ */ FirebaseNamespace, 
      FirebaseAppImpl | FirebaseAppLiteImpl
    ]
  ): typingsJapgolly.firebaseAppTypes.mod.FirebaseNamespace = js.native
}

