package typingsJapgolly.yaml.mod.ast

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yaml.mod.YAMLError
import typingsJapgolly.yaml.mod.YAMLWarning
import typingsJapgolly.yaml.yamlStrings.DOCUMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  /**
    * Anchors associated with the document's nodes;
    * also provides alias & merge node creators.
    */
  var anchors: Anchors
  /**
    * A comment at the end of the document.
    */
  var comment: Null | String
  /**
    * A comment at the very beginning of the document.
    */
  var commentBefore: Null | String
  /**
    * The document contents.
    */
  var contents: AstNode | Null
  /**
    * only available when `keepCstNodes` is set to `true`
    */
  var cstNode: js.UndefOr[typingsJapgolly.yaml.mod.cst.Document] = js.undefined
  /**
    * Errors encountered during parsing.
    */
  var errors: js.Array[YAMLError]
  /**
    * the [start, end] range of characters of the source parsed
    * into this node (undefined if not parsed)
    */
  var range: Null | (js.Tuple2[Double, Double])
  /**
    * The schema used with the document.
    */
  var schema: Schema
  /**
    * a blank line before this node and its commentBefore
    */
  var spaceBefore: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of prefixes; each will have a string `handle` that
    * starts and ends with `!` and a string `prefix` that the handle will be replaced by.
    */
  var tagPrefixes: js.Array[Prefix]
  var `type`: DOCUMENT
  /**
    * The parsed version of the source document;
    * if true-ish, stringified output will include a `%YAML` directive.
    */
  var version: js.UndefOr[String] = js.undefined
  /**
    * Warnings encountered during parsing.
    */
  var warnings: js.Array[YAMLWarning]
  /**
    * List the tags used in the document that are not in the default `tag:yaml.org,2002:` namespace.
    */
  def listNonDefaultTags(): js.Array[String]
  /**
    * Parse a CST into this document
    */
  def parse(cst: typingsJapgolly.yaml.mod.cst.Document): this.type
  /**
    * Set `handle` as a shorthand string for the `prefix` tag namespace.
    */
  def setTagPrefix(handle: String, prefix: String): Unit
  /**
    * A plain JavaScript representation of the document `contents`.
    */
  def toJSON(): js.Any
}

object Document {
  @scala.inline
  def apply(
    anchors: Anchors,
    errors: js.Array[YAMLError],
    listNonDefaultTags: CallbackTo[js.Array[String]],
    parse: typingsJapgolly.yaml.mod.cst.Document => CallbackTo[Document],
    schema: Schema,
    setTagPrefix: (String, String) => Callback,
    tagPrefixes: js.Array[Prefix],
    toJSON: CallbackTo[js.Any],
    `type`: DOCUMENT,
    warnings: js.Array[YAMLWarning],
    comment: String = null,
    commentBefore: String = null,
    contents: AstNode = null,
    cstNode: typingsJapgolly.yaml.mod.cst.Document = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    version: String = null
  ): Document = {
    val __obj = js.Dynamic.literal(anchors = anchors.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], tagPrefixes = tagPrefixes.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.updateDynamic("listNonDefaultTags")(listNonDefaultTags.toJsFn)
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: typingsJapgolly.yaml.mod.cst.Document) => parse(t0).runNow()))
    __obj.updateDynamic("setTagPrefix")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setTagPrefix(t0, t1).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

