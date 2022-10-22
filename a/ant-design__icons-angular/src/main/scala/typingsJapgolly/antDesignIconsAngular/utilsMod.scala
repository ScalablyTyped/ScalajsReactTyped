package typingsJapgolly.antDesignIconsAngular

import org.scalajs.dom.SVGElement
import typingsJapgolly.antDesignIconsAngular.typesMod.IconDefinition
import typingsJapgolly.antDesignIconsAngular.typesMod.ThemeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ant-design/icons-angular/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/icons-angular/utils", "ANT_ICON_ANGULAR_CONSOLE_PREFIX")
  @js.native
  val ANT_ICON_ANGULAR_CONSOLE_PREFIX: /* "[@ant-design/icons-angular]:" */ String = js.native
  
  inline def alreadyHasAThemeSuffix(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("alreadyHasAThemeSuffix")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def cloneSVG(svg: SVGElement): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneSVG")(svg.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  
  inline def error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getIconDefinitionFromAbbr(str: String): IconDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconDefinitionFromAbbr")(str.asInstanceOf[js.Any]).asInstanceOf[IconDefinition]
  
  inline def getNameAndNamespace(`type`: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameAndNamespace")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
  
  inline def getSecondaryColor(primaryColor: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryColor")(primaryColor.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasNamespace(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasNamespace")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIconDefinition(target: String): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIconDefinition")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean]
  inline def isIconDefinition(target: IconDefinition): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIconDefinition")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean]
  
  inline def mapAbbrToTheme(abbr: String): ThemeType = ^.asInstanceOf[js.Dynamic].applyDynamic("mapAbbrToTheme")(abbr.asInstanceOf[js.Any]).asInstanceOf[ThemeType]
  
  inline def replaceFillColor(raw: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceFillColor")(raw.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withSuffix(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withSuffix")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def withSuffix(name: String, theme: ThemeType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withSuffix")(name.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def withSuffixAndColor(name: String, theme: ThemeType, pri: String, sec: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withSuffixAndColor")(name.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], pri.asInstanceOf[js.Any], sec.asInstanceOf[js.Any])).asInstanceOf[String]
}
