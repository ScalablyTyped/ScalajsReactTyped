package typingsJapgolly.virtualDom

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.virtualDom.VirtualDOM.VNode
import typingsJapgolly.virtualDom.VirtualDOM.VNodeConstructor
import typingsJapgolly.virtualDom.VirtualDOM.VProperties
import typingsJapgolly.virtualDom.VirtualDOM.VTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vnodeVnodeMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("virtual-dom/vnode/vnode", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with VNode {
    def this(tagName: String, properties: VProperties, children: js.Array[VTree]) = this()
    def this(tagName: String, properties: VProperties, children: js.Array[VTree], key: String) = this()
    def this(
      tagName: String,
      properties: VProperties,
      children: js.Array[VTree],
      key: String,
      namespace: String
    ) = this()
    def this(tagName: String, properties: VProperties, children: js.Array[VTree], key: Unit, namespace: String) = this()
    
    /* CompleteClass */
    var children: js.Array[VTree] = js.native
    
    /* CompleteClass */
    var count: Double = js.native
    
    /* CompleteClass */
    var descendantHooks: js.Array[Any] = js.native
    
    /* CompleteClass */
    var hasThunks: Boolean = js.native
    
    /* CompleteClass */
    var hasWidgets: Boolean = js.native
    
    /* CompleteClass */
    var hooks: js.Array[Any] = js.native
    
    /* CompleteClass */
    var properties: VProperties = js.native
    
    /* CompleteClass */
    var tagName: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  @JSImport("virtual-dom/vnode/vnode", JSImport.Namespace)
  @js.native
  val ^ : js.Object & VNodeConstructor = js.native
  
  type _To = js.Object & VNodeConstructor
  
  /* This means you don't have to write `^`, but can instead just say `vnodeVnodeMod.foo` */
  override def _to: js.Object & VNodeConstructor = ^
}
