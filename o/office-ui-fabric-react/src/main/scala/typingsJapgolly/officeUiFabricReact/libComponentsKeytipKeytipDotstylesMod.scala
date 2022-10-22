package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutContentStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutContentStyles
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipStyles
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunction
import typingsJapgolly.uifabricUtilities.libPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsKeytipKeytipDotstylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Keytip/Keytip.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCalloutOffsetStyles(offset: Point): IStyleFunction[ICalloutContentStyleProps, ICalloutContentStyles] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalloutOffsetStyles")(offset.asInstanceOf[js.Any]).asInstanceOf[IStyleFunction[ICalloutContentStyleProps, ICalloutContentStyles]]
  
  inline def getCalloutStyles(props: ICalloutContentStyleProps): ICalloutContentStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalloutStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ICalloutContentStyles]
  
  inline def getStyles(props: IKeytipStyleProps): IKeytipStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IKeytipStyles]
}
