package typingsJapgolly.materialBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/base", JSImport.Default)
  @js.native
  open class default[AdapterType /* <: js.Object */] ()
    extends typingsJapgolly.materialBase.foundationMod.default[AdapterType] {
    def this(adapter: AdapterType) = this()
  }
  
  @JSImport("@material/base", "MDCComponent")
  @js.native
  open class MDCComponent[FoundationType /* <: typingsJapgolly.materialBase.foundationMod.MDCFoundation[js.Object] */] protected ()
    extends typingsJapgolly.materialBase.componentMod.MDCComponent[FoundationType] {
    def this(root: Element, foundation: FoundationType, args: Any*) = this()
    def this(root: Element, foundation: Unit, args: Any*) = this()
  }
  /* static members */
  object MDCComponent {
    
    @JSImport("@material/base", "MDCComponent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): typingsJapgolly.materialBase.componentMod.MDCComponent[typingsJapgolly.materialBase.foundationMod.MDCFoundation[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialBase.componentMod.MDCComponent[typingsJapgolly.materialBase.foundationMod.MDCFoundation[js.Object]]]
  }
  
  @JSImport("@material/base", "MDCFoundation")
  @js.native
  open class MDCFoundation[AdapterType /* <: js.Object */] ()
    extends typingsJapgolly.materialBase.foundationMod.MDCFoundation[AdapterType] {
    def this(adapter: AdapterType) = this()
  }
}
