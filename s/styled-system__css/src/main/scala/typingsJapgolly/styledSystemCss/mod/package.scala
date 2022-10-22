package typingsJapgolly.styledSystemCss.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.PropertiesFallback
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.styledSystemCss.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default(): CssFunctionReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[CssFunctionReturnType]
inline def default(input: SystemStyleObject): CssFunctionReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[CssFunctionReturnType]

inline def css(): CssFunctionReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("css")().asInstanceOf[CssFunctionReturnType]
inline def css(input: SystemStyleObject): CssFunctionReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(input.asInstanceOf[js.Any]).asInstanceOf[CssFunctionReturnType]

inline def get(`object`: js.Object, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def get(`object`: js.Object, key: String, defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def get(`object`: js.Object, key: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def get(`object`: js.Object, key: js.Array[String], defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def responsive(styles: js.Object): js.Function1[/* theme */ js.Object, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("responsive")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* theme */ js.Object, js.Array[Any]]]

type CSSInterpolation = js.UndefOr[Double | String | CSSObject]

type CSSOthersObjectForCSSObject = StringDictionary[CSSInterpolation]

type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]

type ResponsiveStyleValue[T] = T | (js.Array[T | Null])

type StandardCSSProperties = PropertiesFallback[Double | String, String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.styledSystemCss.mod.SystemCssProperties
  - typingsJapgolly.styledSystemCss.mod.CSSPseudoSelectorProps
  - typingsJapgolly.styledSystemCss.mod.CSSSelectorObject
  - typingsJapgolly.styledSystemCss.mod.VariantProperty
  - typingsJapgolly.styledSystemCss.mod.UseThemeFunction
  - typingsJapgolly.styledSystemCss.mod.EmotionLabel
  - scala.Null
*/
type SystemStyleObject = _SystemStyleObject | Null

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.styledSystemCss.anon.KinkeyofStandardCSSProper
  - typingsJapgolly.styledSystemCss.anon.PartialScaleThemeProperti
  - typingsJapgolly.styledSystemCss.mod.ThemeBreakPoints
  - org.scalablytyped.runtime.StringDictionary[scala.Any]
*/
type Theme = _Theme | StringDictionary[Any]

type ThemeValue[T] = js.Array[T] | (StringDictionary[T | Any])
