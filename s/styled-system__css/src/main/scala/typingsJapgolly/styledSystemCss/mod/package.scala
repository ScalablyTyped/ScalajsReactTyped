package typingsJapgolly.styledSystemCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CSSInterpolation = js.UndefOr[scala.Double | java.lang.String | typingsJapgolly.styledSystemCss.mod.CSSObject]
  /**
    * Omit exists in TypeScript >= v3.5, we're putting this here so typings can be
    * used with earlier versions of TypeScript.
    */
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type ResponsiveStyleValue[T] = T | (js.Array[T | scala.Null])
  type StandardCSSProperties = typingsJapgolly.csstype.mod.PropertiesFallback[scala.Double | java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.styledSystemCss.KinkeyofStandardCSSProper
    - typingsJapgolly.styledSystemCss.PartialScaleThemeProperti
    - typingsJapgolly.styledSystemCss.mod.ThemeBreakPoints
    - org.scalablytyped.runtime.StringDictionary[
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.Theme * / js.Object]
  */
  type Theme = typingsJapgolly.styledSystemCss.mod._Theme | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.Theme */ js.Object
  ])
  type ThemeValue[T] = js.Array[T] | (org.scalablytyped.runtime.StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.ThemeValue<T> */ js.Object)
  ])
}
