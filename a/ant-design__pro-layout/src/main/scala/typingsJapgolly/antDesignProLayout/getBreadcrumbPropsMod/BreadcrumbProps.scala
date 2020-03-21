package typingsJapgolly.antDesignProLayout.getBreadcrumbPropsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antDesignProLayout.AnonDefaultOpenAll
import typingsJapgolly.antDesignProLayout.AnonHref
import typingsJapgolly.antDesignProLayout.AnonPathname
import typingsJapgolly.antDesignProLayout.typingsMod.MenuDataItem
import typingsJapgolly.antDesignProLayout.typingsMod.MessageDescriptor
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var breadcrumbList: js.UndefOr[js.Array[AnonHref]] = js.undefined
  var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.undefined
  var breadcrumbRender: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ /* routers */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ js.Any
    ]
  ] = js.undefined
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.undefined
  var home: js.UndefOr[String] = js.undefined
  var itemRender: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['itemRender'] */ js.Any
  ] = js.undefined
  var location: js.UndefOr[Location[LocationState] | AnonPathname] = js.undefined
  var menu: js.UndefOr[AnonDefaultOpenAll] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(
    breadcrumbList: js.Array[AnonHref] = null,
    breadcrumbMap: Map[String, MenuDataItem] = null,
    breadcrumbRender: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ /* routers */ js.Any => CallbackTo[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ js.Any
    ] = null,
    formatMessage: /* message */ MessageDescriptor => CallbackTo[String] = null,
    home: String = null,
    itemRender: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['itemRender'] */ js.Any = null,
    location: Location[LocationState] | AnonPathname = null,
    menu: AnonDefaultOpenAll = null
  ): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    if (breadcrumbList != null) __obj.updateDynamic("breadcrumbList")(breadcrumbList.asInstanceOf[js.Any])
    if (breadcrumbMap != null) __obj.updateDynamic("breadcrumbMap")(breadcrumbMap.asInstanceOf[js.Any])
    if (breadcrumbRender != null) __obj.updateDynamic("breadcrumbRender")(js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ /* routers */ js.Any) => breadcrumbRender(t0).runNow()))
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.antDesignProLayout.typingsMod.MessageDescriptor) => formatMessage(t0).runNow()))
    if (home != null) __obj.updateDynamic("home")(home.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(itemRender.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

