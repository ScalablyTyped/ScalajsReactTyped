package typingsJapgolly.atlaskitPopper

import typingsJapgolly.atlaskitPopper.anon.ReadonlyManagerProps
import typingsJapgolly.atlaskitPopper.anon.ReadonlyReferenceProps
import typingsJapgolly.atlaskitPopper.distTypesPopperMod.CustomPopperProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactPopper.mod.ManagerProps
import typingsJapgolly.reactPopper.mod.ReferenceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/popper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@atlaskit/popper", "Manager")
  @js.native
  open class Manager protected ()
    extends typingsJapgolly.reactPopper.mod.Manager {
    def this(props: ReadonlyManagerProps) = this()
    def this(props: ManagerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ManagerProps, context: Any) = this()
  }
  
  inline def Popper[CustomModifiers](hasChildrenOffsetPlacementReferenceElementModifiersStrategy: CustomPopperProps[CustomModifiers]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Popper")(hasChildrenOffsetPlacementReferenceElementModifiersStrategy.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@atlaskit/popper", "Reference")
  @js.native
  open class Reference protected ()
    extends typingsJapgolly.reactPopper.mod.Reference {
    def this(props: ReadonlyReferenceProps) = this()
    def this(props: ReferenceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReferenceProps, context: Any) = this()
  }
}
