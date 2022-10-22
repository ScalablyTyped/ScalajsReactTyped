package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSizeMod.Size
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSizeMod.SizeAdapter
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcAugmentElementMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/augmentElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def augmentElement(element: Element & RefAttributes[Any], newProps: Record[String, Any]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentElement")(element.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def createEmbeddableAdapter[T /* <: Size */](sizeAdapter: SizeAdapter[T]): js.Function2[/* element */ Element, /* hasSizeProps */ RecordWithSize, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmbeddableAdapter")(sizeAdapter.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* element */ Element, /* hasSizeProps */ RecordWithSize, Element]]
  
  type RecordWithSize = typingsJapgolly.orbitUiReactComponents.anon.Size & (Record[String, Any])
}
