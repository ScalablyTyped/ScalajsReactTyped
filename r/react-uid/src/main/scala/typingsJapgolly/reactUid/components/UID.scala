package typingsJapgolly.reactUid.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactUid.distEs5ContextMod.UIDProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UID {
  
  inline def apply(children: (String, js.Function2[/* item */ Any, /* index */ js.UndefOr[Double], String]) => Node): SharedBuilder_UIDProps1019690087[typingsJapgolly.reactUid.distEs5UidcomponentMod.UID] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    new SharedBuilder_UIDProps1019690087[typingsJapgolly.reactUid.distEs5UidcomponentMod.UID](js.Array(this.component, __props.asInstanceOf[UIDProps]))
  }
  
  @JSImport("react-uid/dist/es5/UIDComponent", "UID")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: UIDProps): SharedBuilder_UIDProps1019690087[typingsJapgolly.reactUid.distEs5UidcomponentMod.UID] = new SharedBuilder_UIDProps1019690087[typingsJapgolly.reactUid.distEs5UidcomponentMod.UID](js.Array(this.component, p.asInstanceOf[js.Any]))
}
