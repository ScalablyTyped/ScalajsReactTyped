package typingsJapgolly.antvGLite.mod

import typingsJapgolly.antvGLite.distDomInterfacesMod.IElement
import typingsJapgolly.antvGLite.distDomInterfacesMod.IEventTarget
import typingsJapgolly.antvGLite.distDomInterfacesMod.INode
import typingsJapgolly.antvGLite.distTypesMod.BaseStyleProps
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "Element")
@js.native
open class Element[StyleProps /* <: BaseStyleProps */, ParsedStyleProps /* <: ParsedBaseStyleProps */] ()
  extends typingsJapgolly.antvGLite.distDomMod.Element[StyleProps, ParsedStyleProps]
/* static members */
object Element {
  
  @JSImport("@antv/g-lite", "Element")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isElement(target: IElement[Any, Any]): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean]
  inline def isElement(target: IEventTarget): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean]
  inline def isElement(target: INode): /* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/dom/interfaces.IElement<any, any> */ Boolean]
}
