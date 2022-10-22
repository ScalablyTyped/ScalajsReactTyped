package typingsJapgolly.reactMentions

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.reactMentions.anon.PartialCSSProperties
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsDefaultStyleMod {
  
  @JSImport("react-mentions/lib/utils/defaultStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDefaultStyle(defaultStyle: PartialCSSProperties): Component[js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultStyle")(defaultStyle.asInstanceOf[js.Any]).asInstanceOf[Component[js.Object, js.Object]]
  inline def createDefaultStyle(defaultStyle: PartialCSSProperties, getModifiers: Record[String, Any]): Component[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultStyle")(defaultStyle.asInstanceOf[js.Any], getModifiers.asInstanceOf[js.Any])).asInstanceOf[Component[js.Object, js.Object]]
}
