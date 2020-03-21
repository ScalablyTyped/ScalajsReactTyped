package typingsJapgolly.antDesignProLayout.pageHeaderWrapperMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignProLayout.antDesignProLayoutBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PageHeaderProps * / any, 'title'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PageHeaderProps * / any[P]} */ trait PageHeaderWrapperProps extends PageHeaderTabConfig {
  var content: js.UndefOr[Node] = js.undefined
  var extraContent: js.UndefOr[Node] = js.undefined
  var pageHeaderRender: js.UndefOr[js.Function1[/* props */ PageHeaderWrapperProps, Node]] = js.undefined
  var title: js.UndefOr[Node | `false`] = js.undefined
}

object PageHeaderWrapperProps {
  @scala.inline
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
    title: Node | `false` = null
  ): PageHeaderWrapperProps = {
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
    __obj.asInstanceOf[PageHeaderWrapperProps]
  }
}

