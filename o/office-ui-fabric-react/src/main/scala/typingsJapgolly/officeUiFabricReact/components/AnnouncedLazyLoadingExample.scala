package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.announcedLazyLoadingExampleMod.IAnnouncedLazyLoadingExampleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AnnouncedLazyLoadingExample {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IAnnouncedLazyLoadingExampleProps, 
    typingsJapgolly.officeUiFabricReact.announcedLazyLoadingExampleMod.AnnouncedLazyLoadingExample, 
    Unit, 
    IAnnouncedLazyLoadingExampleProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.announcedLazyLoadingExampleMod.IAnnouncedLazyLoadingExampleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.announcedLazyLoadingExampleMod.AnnouncedLazyLoadingExample](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.announcedLazyLoadingExampleMod.IAnnouncedLazyLoadingExampleProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/Announced/examples/Announced.LazyLoading.Example", "AnnouncedLazyLoadingExample")
  @js.native
  object componentImport extends js.Object
  
}

