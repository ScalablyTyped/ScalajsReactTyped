package typingsJapgolly.atAngularCore.atAngularCoreMod

import typingsJapgolly.atAngularCore.InitialInputData
import typingsJapgolly.atAngularCore.TAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for a view  */
trait TViewNode extends TNode {
  @JSName("child")
  var child_TViewNode: ɵangular_packages_core_core_bf | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode | Null
  @JSName("parent")
  var parent_TViewNode: TContainerNode | Null
  @JSName("projection")
  var projection_TViewNode: Null
  @JSName("tViews")
  var tViews_TViewNode: Null
}

object TViewNode {
  @scala.inline
  def apply(
    directiveEnd: Double,
    directiveStart: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    projection: Null,
    propertyMetadataEndIndex: Double,
    propertyMetadataStartIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    tViews: Null,
    `type`: TNodeType,
    attrs: TAttributes = null,
    child: ɵangular_packages_core_core_bf | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode = null,
    classes: StylingMapArray | TStylingContext = null,
    initialInputs: InitialInputData = null,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: TContainerNode = null,
    projectionNext: TNode = null,
    styles: StylingMapArray | TStylingContext = null,
    tagName: String = null
  ): TViewNode = {
    val __obj = js.Dynamic.literal(directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], propertyMetadataEndIndex = propertyMetadataEndIndex.asInstanceOf[js.Any], propertyMetadataStartIndex = propertyMetadataStartIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (initialInputs != null) __obj.updateDynamic("initialInputs")(initialInputs.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (localNames != null) __obj.updateDynamic("localNames")(localNames.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projectionNext != null) __obj.updateDynamic("projectionNext")(projectionNext.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TViewNode]
  }
}

