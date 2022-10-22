package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.Image
import typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IIconStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IIconStyles
import typingsJapgolly.uifabricMergeStyles.libIstylesetMod.IProcessedStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsIconIconDotstylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Icon/Icon.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon/Icon.styles", "MS_ICON")
  @js.native
  val MS_ICON: /* "ms-Icon" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon/Icon.styles", "classNames")
  @js.native
  val classNames: IProcessedStyleSet[Image] = js.native
  
  inline def getStyles(props: IIconStyleProps): IIconStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IIconStyles]
}
