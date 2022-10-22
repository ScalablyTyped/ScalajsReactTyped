package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonStyles
import typingsJapgolly.officeUiFabricReact.libComponentsNavNavDottypesMod.INavStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsNavNavDottypesMod.INavStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsNavNavDotstylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Nav/Nav.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Nav/Nav.styles", "buttonStyles")
  @js.native
  val buttonStyles: IButtonStyles = js.native
  
  inline def getStyles(props: INavStyleProps): INavStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[INavStyles]
}
