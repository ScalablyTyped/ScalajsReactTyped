package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsJapgolly.antDesignProLayout.pageHeaderWrapperMod.PageHeaderWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageHeaderWrapper {
  def apply(
    content: VdomNode = null,
    extraContent: VdomNode = null,
    onTabChange: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps * / any['onChange'] */ js.Any = null,
    pageHeaderRender: /* props */ PageHeaderWrapperProps => CallbackTo[Node] = null,
    tabActiveKey: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps * / any['activeKey'] */ js.Any = null,
    tabBarExtraContent: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps * / any['tabBarExtraContent'] */ js.Any = null,
    tabList: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabPaneProps */ _
    ] = null,
    tabProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps */ js.Any = null,
    title: Node | `false` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PageHeaderWrapperProps, 
    MountedWithRawType[PageHeaderWrapperProps, js.Object, RawMounted[PageHeaderWrapperProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (extraContent != null) __obj.updateDynamic("extraContent")(extraContent.rawNode.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(onTabChange.asInstanceOf[js.Any])
    if (pageHeaderRender != null) __obj.updateDynamic("pageHeaderRender")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antDesignProLayout.pageHeaderWrapperMod.PageHeaderWrapperProps) => pageHeaderRender(t0).runNow()))
    if (tabActiveKey != null) __obj.updateDynamic("tabActiveKey")(tabActiveKey.asInstanceOf[js.Any])
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.asInstanceOf[js.Any])
    if (tabList != null) __obj.updateDynamic("tabList")(tabList.asInstanceOf[js.Any])
    if (tabProps != null) __obj.updateDynamic("tabProps")(tabProps.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antDesignProLayout.pageHeaderWrapperMod.PageHeaderWrapperProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignProLayout.pageHeaderWrapperMod.PageHeaderWrapperProps])(children: _*)
  }
  @JSImport("@ant-design/pro-layout/lib/PageHeaderWrapper", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

