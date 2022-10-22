package typingsJapgolly.officeUiFabricReact.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.officeUiFabricReact.anon.PartialIStackProps
import typingsJapgolly.officeUiFabricReact.anon.WeakValidationMapIStackPr
import typingsJapgolly.officeUiFabricReact.libComponentsStackStackDottypesMod.IStackProps
import typingsJapgolly.officeUiFabricReact.libComponentsStackStackItemStackItemDottypesMod.IStackItemProps
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/Stack.types.IStackProps> & {  Item :react.react.FunctionComponent<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/StackItem/StackItem.types.IStackItemProps>} */
object Stack {
  
  inline def apply(props: IStackProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def apply(props: IStackProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  @JSImport("office-ui-fabric-react", "Stack")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "Stack.Item")
  @js.native
  def Item: FunctionComponent[IStackItemProps] = js.native
  inline def Item_=(x: FunctionComponent[IStackItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "Stack.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "Stack.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialIStackProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialIStackProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "Stack.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "Stack.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapIStackPr] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapIStackPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
