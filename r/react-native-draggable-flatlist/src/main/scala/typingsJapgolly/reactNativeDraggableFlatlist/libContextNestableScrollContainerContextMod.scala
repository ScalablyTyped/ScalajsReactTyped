package typingsJapgolly.reactNativeDraggableFlatlist

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeDraggableFlatlist.anon.Children
import typingsJapgolly.reactNativeDraggableFlatlist.anon.ContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextNestableScrollContainerContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/context/nestableScrollContainerContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NestableScrollContainerProvider(hasChildren: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableScrollContainerProvider")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useNestableScrollContainerContext(): ContainerRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useNestableScrollContainerContext")().asInstanceOf[ContainerRef]
}
