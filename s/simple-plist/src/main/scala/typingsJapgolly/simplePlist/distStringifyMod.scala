package typingsJapgolly.simplePlist

import typingsJapgolly.simplePlist.distTypesMod.PlistJsObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStringifyMod {
  
  @JSImport("simple-plist/dist/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(anObject: PlistJsObj): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(anObject.asInstanceOf[js.Any]).asInstanceOf[String]
}
