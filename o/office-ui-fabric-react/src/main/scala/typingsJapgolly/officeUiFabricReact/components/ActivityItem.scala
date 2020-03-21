package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemProps
import typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemStyles
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typingsJapgolly.react.mod.AllHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActivityItem {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    activityDescription: js.Array[Node] | Node = null,
    activityDescriptionText: String = null,
    activityIcon: VdomNode = null,
    activityPersonas: js.Array[IPersonaSharedProps] = null,
    animateBeaconSignal: js.UndefOr[Boolean] = js.undefined,
    beaconColorOne: String = null,
    beaconColorTwo: String = null,
    commentText: String = null,
    comments: js.Array[Node] | Node = null,
    isCompact: js.UndefOr[Boolean] = js.undefined,
    onRenderActivityDescription: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderComments: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderIcon: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderTimeStamp: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    styles: IActivityItemStyles = null,
    timeStamp: String | js.Array[Node] | Node = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IActivityItemProps, 
    typingsJapgolly.officeUiFabricReact.mod.ActivityItem, 
    Unit, 
    IActivityItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (activityDescription != null) __obj.updateDynamic("activityDescription")(activityDescription.asInstanceOf[js.Any])
    if (activityDescriptionText != null) __obj.updateDynamic("activityDescriptionText")(activityDescriptionText.asInstanceOf[js.Any])
    if (activityIcon != null) __obj.updateDynamic("activityIcon")(activityIcon.rawNode.asInstanceOf[js.Any])
    if (activityPersonas != null) __obj.updateDynamic("activityPersonas")(activityPersonas.asInstanceOf[js.Any])
    if (!js.isUndefined(animateBeaconSignal)) __obj.updateDynamic("animateBeaconSignal")(animateBeaconSignal.asInstanceOf[js.Any])
    if (beaconColorOne != null) __obj.updateDynamic("beaconColorOne")(beaconColorOne.asInstanceOf[js.Any])
    if (beaconColorTwo != null) __obj.updateDynamic("beaconColorTwo")(beaconColorTwo.asInstanceOf[js.Any])
    if (commentText != null) __obj.updateDynamic("commentText")(commentText.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompact)) __obj.updateDynamic("isCompact")(isCompact.asInstanceOf[js.Any])
    if (onRenderActivityDescription != null) __obj.updateDynamic("onRenderActivityDescription")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderActivityDescription(t0, t1).runNow()))
    if (onRenderComments != null) __obj.updateDynamic("onRenderComments")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderComments(t0, t1).runNow()))
    if (onRenderIcon != null) __obj.updateDynamic("onRenderIcon")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderIcon(t0, t1).runNow()))
    if (onRenderTimeStamp != null) __obj.updateDynamic("onRenderTimeStamp")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderTimeStamp(t0, t1).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.ActivityItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.activityItemTypesMod.IActivityItemProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "ActivityItem")
  @js.native
  object componentImport extends js.Object
  
}

