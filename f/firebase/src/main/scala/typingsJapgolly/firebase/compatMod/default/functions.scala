package typingsJapgolly.firebase.compatMod.default

import typingsJapgolly.firebase.compatMod.firebase.app.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functions {
  
  inline def apply(): typingsJapgolly.firebase.compatMod.firebase.functions.Functions = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.functions.Functions]
  inline def apply(app: App): typingsJapgolly.firebase.compatMod.firebase.functions.Functions = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebase.compatMod.firebase.functions.Functions]
  
  @JSImport("firebase/compat", "default.functions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/compat", "default.functions.Functions")
  @js.native
  /* private */ open class Functions ()
    extends StObject
       with typingsJapgolly.firebase.compatMod.firebase.functions.Functions
}
