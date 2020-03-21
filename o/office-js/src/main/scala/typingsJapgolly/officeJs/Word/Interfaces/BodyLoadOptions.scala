package typingsJapgolly.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the body of a document or a section.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait BodyLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the text format of the body. Use this to get and set font name, size, color and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.native
  /**
    *
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Throws an error if there isn't a parent body.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.native
  /**
    *
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Returns a null object if there isn't a parent body.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBodyOrNullObject: js.UndefOr[BodyLoadOptions] = js.native
  /**
    *
    * Gets the content control that contains the body. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * Gets the content control that contains the body. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * Gets the parent section of the body. Throws an error if there isn't a parent section.
    *
    * [Api set: WordApi 1.3]
    */
  var parentSection: js.UndefOr[SectionLoadOptions] = js.native
  /**
    *
    * Gets the parent section of the body. Returns a null object if there isn't a parent section.
    *
    * [Api set: WordApi 1.3]
    */
  var parentSectionOrNullObject: js.UndefOr[SectionLoadOptions] = js.native
  /**
    *
    * Gets or sets the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the text of the body. Use the insertText method to insert text. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the type of the body. The type can be 'MainDoc', 'Section', 'Header', 'Footer', or 'TableCell'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[Boolean] = js.native
}

