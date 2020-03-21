package typingsJapgolly.mustache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type COMMENT = typingsJapgolly.mustache.mustacheStrings.Exclamationmark
  type EQUAL = typingsJapgolly.mustache.mustacheStrings.Equalssign
  type ESCAPED_VALUE = typingsJapgolly.mustache.mustacheStrings.name
  type INVERTED = typingsJapgolly.mustache.mustacheStrings.^
  /**
    * An array of two strings, representing the opening and closing tags respectively, to be used in the templates being rendered.
    */
  type OpeningAndClosingTags = js.Tuple2[java.lang.String, java.lang.String]
  type PARTIAL = typingsJapgolly.mustache.mustacheStrings.Greaterthansign
  type PartialLookupFn = js.Function1[/* partialName */ java.lang.String, js.UndefOr[java.lang.String]]
  /**
    * Whenever partials are provided, it can either be an object that contains the names and templates of partials that are used in tempaltes
    *
    * -- or --
    *
    * A function that is used to load partial template on the fly that takes a single argument: the name of the partial.
    */
  type PartialsOrLookupFn = (typingsJapgolly.std.Record[java.lang.String, java.lang.String]) | typingsJapgolly.mustache.mod.PartialLookupFn
  type RAW_VALUE = typingsJapgolly.mustache.mustacheStrings.text
  type SECTION = typingsJapgolly.mustache.mustacheStrings.Numbersign
  type TemplateSpanType = typingsJapgolly.mustache.mod.RAW_VALUE | typingsJapgolly.mustache.mod.ESCAPED_VALUE | typingsJapgolly.mustache.mod.SECTION | typingsJapgolly.mustache.mod.UNESCAPED_VALUE | typingsJapgolly.mustache.mod.INVERTED | typingsJapgolly.mustache.mod.COMMENT | typingsJapgolly.mustache.mod.PARTIAL | typingsJapgolly.mustache.mod.EQUAL
  type TemplateSpans = js.Array[
    (js.Tuple4[
      typingsJapgolly.mustache.mod.TemplateSpanType, 
      java.lang.String, 
      scala.Double, 
      scala.Double
    ]) | (js.Tuple6[
      typingsJapgolly.mustache.mod.TemplateSpanType, 
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mustache.mustache.TemplateSpans */ js.Object, 
      scala.Double
    ]) | (js.Tuple7[
      typingsJapgolly.mustache.mod.TemplateSpanType, 
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      java.lang.String, 
      scala.Double, 
      scala.Boolean
    ])
  ]
  type UNESCAPED_VALUE = typingsJapgolly.mustache.mustacheStrings.Ampersand
}
