package typingsJapgolly.antDesignProLayout.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.anon.Desc
import typingsJapgolly.antDesignProLayout.esComponentsAppsLogoComponentsTypesMod.AppsLogoComponentsAppList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AppList2146500007 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def appList(value: AppsLogoComponentsAppList): this.type = set("appList", value.asInstanceOf[js.Any])
  
  inline def appListVarargs(value: Desc*): this.type = set("appList", js.Array(value*))
  
  inline def hashId(value: String): this.type = set("hashId", value.asInstanceOf[js.Any])
}
