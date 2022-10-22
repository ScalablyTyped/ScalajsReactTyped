package typingsJapgolly.jss.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Comment
import org.scalajs.dom.HTMLElement
import typingsJapgolly.csstype.mod.Properties
import typingsJapgolly.jss.anon.PartialJssOptions
import typingsJapgolly.jss.jssBooleans.`false`
import typingsJapgolly.jss.jssStrings.Exclamationmarkimportant
import typingsJapgolly.jss.mod.^
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: Jss = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[Jss]

inline def create(): Jss = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Jss]
inline def create(options: PartialJssOptions): Jss = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Jss]

inline def createGenerateId: CreateGenerateId_ = ^.asInstanceOf[js.Dynamic].selectDynamic("createGenerateId").asInstanceOf[CreateGenerateId_]

inline def createRule[D](name: String, decl: JssStyle[Any, Unit], options: RuleOptions): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("createRule")(name.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rule]

inline def getDynamicStyles(styles: Styles[String, Any, Unit]): (Styles[String, Any, Unit]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDynamicStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[(Styles[String, Any, Unit]) | Null]

/**
  * Creates a new instance of JSS.
  */
inline def sheets: SheetsRegistry = ^.asInstanceOf[js.Dynamic].selectDynamic("sheets").asInstanceOf[SheetsRegistry]

inline def toCssValue(value: JssValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCssValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]

type Classes[Name /* <: String | Double | js.Symbol */] = Record[Name, String]

type CreateGenerateId_ = js.Function1[/* options */ js.UndefOr[CreateGenerateIdOptions], GenerateId]

type GenerateId = js.Function2[/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]], String]

type InsertionPoint = String | HTMLElement | Comment

type JssStyle[Props, Theme] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof jss.jss.NormalCssProperties ]: jss.jss.NormalCssValues<K> | any | jss.jss.Func<Props, Theme, jss.jss.NormalCssValues<K> | any | undefined> | jss.jss.MinimalObservable<jss.jss.NormalCssValues<K> | any | undefined>} */ js.Any) | (StringDictionary[
JssValue | Any | (Func[Props, Theme, js.UndefOr[JssValue | Any]]) | (MinimalObservable[js.UndefOr[JssValue | Any]])])

type JssValue = String | (Double & js.Object) | (js.Array[String | Double | (js.Array[String | Double]) | Exclamationmarkimportant]) | Null | `false`

type Keyframes[Name /* <: String */] = Record[Name, String]

type NormalCssProperties = Properties[String | Double, String]
