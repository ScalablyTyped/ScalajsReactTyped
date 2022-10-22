package typingsJapgolly.blueprintjsPopover2

import typingsJapgolly.blueprintjsPopover2.anon.Left
import typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.bottom
import typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.center
import typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.left
import typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.right
import typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmUtilsMod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAlignment(
    placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
  ): right | left | center = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlignment")(placement.asInstanceOf[js.Any]).asInstanceOf[right | left | center]
  
  inline def getBasePlacement(
    placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBasePlacement")(placement.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getOppositePlacement(
    side: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BasePlacement */ Any
  ): top | bottom | right | left = ^.asInstanceOf[js.Dynamic].applyDynamic("getOppositePlacement")(side.asInstanceOf[js.Any]).asInstanceOf[top | bottom | right | left]
  
  inline def getTransformOrigin(
    placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformOrigin")(placement.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getTransformOrigin(
    placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any,
    arrowStyles: Left
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformOrigin")(placement.asInstanceOf[js.Any], arrowStyles.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isVerticalPlacement(
    side: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BasePlacement */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalPlacement")(side.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
