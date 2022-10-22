package typingsJapgolly.reactMdTree

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactMdIcon.typesIconRotatorMod.IconRotatorBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTreeItemExpanderIconMod {
  
  @JSImport("@react-md/tree/types/TreeItemExpanderIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TreeItemExpanderIcon(hasClassNameChildrenRotatedProps: TreeItemExpanderIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeItemExpanderIcon")(hasClassNameChildrenRotatedProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TreeItemExpanderIconProps
    extends StObject
       with IconRotatorBaseProps
  object TreeItemExpanderIconProps {
    
    inline def apply(rotated: Boolean): TreeItemExpanderIconProps = {
      val __obj = js.Dynamic.literal(rotated = rotated.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeItemExpanderIconProps]
    }
  }
}
