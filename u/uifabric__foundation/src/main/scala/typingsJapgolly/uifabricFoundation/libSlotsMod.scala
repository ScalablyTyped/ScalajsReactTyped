package typingsJapgolly.uifabricFoundation

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.Required
import typingsJapgolly.std.ReturnType
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlot
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotFactory
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlots
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsJapgolly.uifabricFoundation.libIslotsMod.ValidProps
import typingsJapgolly.uifabricFoundation.libIslotsMod.ValidShorthand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSlotsMod {
  
  @JSImport("@uifabric/foundation/lib/slots", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps]): ISlotFactory[TProps, TShorthandProp] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(DefaultComponent.asInstanceOf[js.Any]).asInstanceOf[ISlotFactory[TProps, TShorthandProp]]
  inline def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(DefaultComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ISlotFactory[TProps, TShorthandProp]]
  
  inline def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlots")(userProps.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[ISlots[Required[TComponentSlots]]]
  
  inline def withSlots[P](`type`: String, props: Attributes & P, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: String, props: Null, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: String, props: Unit, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: FunctionComponent[P], props: Null, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: FunctionComponent[P], props: Unit, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: ISlot[P], props: Attributes & P, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: ISlot[P], props: Null, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: ISlot[P], props: Unit, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
}
