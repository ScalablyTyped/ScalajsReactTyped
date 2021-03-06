package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.r3AstMod.BoundAttribute
import typingsJapgolly.angularCompiler.r3AstMod.BoundEvent
import typingsJapgolly.angularCompiler.r3AstMod.Node
import typingsJapgolly.angularCompiler.r3AstMod.Reference
import typingsJapgolly.angularCompiler.r3AstMod.Template
import typingsJapgolly.angularCompiler.r3AstMod.TextAttribute
import typingsJapgolly.angularCompiler.r3AstMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TmplAstTemplate")
@js.native
class TmplAstTemplate protected () extends Template {
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: Null,
    i18n: Message
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: Null,
    i18n: typingsJapgolly.angularCompiler.i18nAstMod.Node
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: Null,
    endSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: typingsJapgolly.angularCompiler.i18nAstMod.Node
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: Null,
    i18n: Message
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: Null,
    i18n: typingsJapgolly.angularCompiler.i18nAstMod.Node
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    tagName: String,
    attributes: js.Array[TextAttribute],
    inputs: js.Array[BoundAttribute],
    outputs: js.Array[BoundEvent],
    templateAttrs: js.Array[BoundAttribute | TextAttribute],
    children: js.Array[Node],
    references: js.Array[Reference],
    variables: js.Array[Variable],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    startSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    endSourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: typingsJapgolly.angularCompiler.i18nAstMod.Node
  ) = this()
}

