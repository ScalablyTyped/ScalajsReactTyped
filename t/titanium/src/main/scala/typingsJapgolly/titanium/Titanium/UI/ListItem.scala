package typingsJapgolly.titanium.Titanium.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Font
import typingsJapgolly.titanium.Gradient
import typingsJapgolly.titanium.RowActionType
import typingsJapgolly.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A list item is an individual item in a list section.
		 */
trait ListItem extends Proxy {
  /**
  			 * Sets an accessory on the right side of an item.
  			 */
  var accessoryType: Double
  /**
  			 * Background color of the view, as a color name or hex triplet.
  			 */
  var backgroundColor: String
  /**
  			 * Background gradient to render when the item is not selected.
  			 */
  var backgroundGradient: Gradient
  /**
  			 * Background image to render when the item is not selected.
  			 */
  var backgroundImage: String
  /**
  			 * Specifies if the item can be deleted by a user initiated action.
  			 */
  var canEdit: Boolean
  /**
  			 * Specifies if the item can be inserted by a user initiated action.
  			 */
  var canInsert: Boolean
  /**
  			 * Specifies if the item can be reordered within the list view by a user initiated action.
  			 */
  var canMove: Boolean
  /**
  			 * Default text color of the item when not selected, as a color name or hex triplet.
  			 */
  var color: String
  /**
  			 * Specifies custom action items to be shown when when a list item is edited.
  			 */
  var editActions: js.Array[RowActionType]
  /**
  			 * Font to use for the item title.
  			 */
  var font: Font
  /**
  			 * Row height in platform-specific units.
  			 */
  var height: Double | String
  /**
  			 * Image to render in the image area of the item, specified as a local path or URL.
  			 */
  var image: String
  /**
  			 * A user defined string that gets passed to events.
  			 */
  var itemId: String
  /**
  			 * The text to match against when the [ListView](Titanium.UI.ListView) is performing a search.
  			 */
  var searchableText: String
  /**
  			 * Background color of the view, as a color name or hex triplet when item is selected.
  			 */
  var selectedBackgroundColor: String
  /**
  			 * Background gradient to render when the item is selected.
  			 */
  var selectedBackgroundGradient: Gradient
  /**
  			 * Background image to render when the item is selected.
  			 */
  var selectedBackgroundImage: String
  /**
  			 * Color to use for the item title when the item is selected, as a color name or hex triplet.
  			 */
  var selectedColor: String
  /**
  			 * Color to use for the item subtitle when the item is selected, as a color name or hex triplet.
  			 */
  var selectedSubtitleColor: String
  /**
  			 * Selection style constant to control the selection color.
  			 */
  var selectionStyle: Double
  /**
  			 * Subtitle to set in the text area of the item.
  			 */
  var subtitle: String
  /**
  			 * Default text color of the subtitle, as a color name or hex triplet.
  			 */
  var subtitleColor: String
  /**
  			 * Title to set in the text area of the item.
  			 */
  var title: String
  /**
  			 * Gets the value of the <Titanium.UI.ListItem.editActions> property.
  			 */
  def getEditActions(): js.Array[RowActionType]
  /**
  			 * Gets the value of the <Titanium.UI.ListItem.selectedColor> property.
  			 */
  def getSelectedColor(): String
  /**
  			 * Gets the value of the <Titanium.UI.ListItem.selectedSubtitleColor> property.
  			 */
  def getSelectedSubtitleColor(): String
  /**
  			 * Sets the value of the <Titanium.UI.ListItem.editActions> property.
  			 */
  def setEditActions(editActions: js.Array[RowActionType]): Unit
  /**
  			 * Sets the value of the <Titanium.UI.ListItem.selectedColor> property.
  			 */
  def setSelectedColor(selectedColor: String): Unit
  /**
  			 * Sets the value of the <Titanium.UI.ListItem.selectedSubtitleColor> property.
  			 */
  def setSelectedSubtitleColor(selectedSubtitleColor: String): Unit
}

object ListItem {
  @scala.inline
  def apply(
    accessoryType: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    backgroundColor: String,
    backgroundGradient: Gradient,
    backgroundImage: String,
    bubbleParent: Boolean,
    canEdit: Boolean,
    canInsert: Boolean,
    canMove: Boolean,
    color: String,
    editActions: js.Array[RowActionType],
    fireEvent: (String, js.Any) => Callback,
    font: Font,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getEditActions: CallbackTo[js.Array[RowActionType]],
    getSelectedColor: CallbackTo[String],
    getSelectedSubtitleColor: CallbackTo[String],
    height: Double | String,
    image: String,
    itemId: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    searchableText: String,
    selectedBackgroundColor: String,
    selectedBackgroundGradient: Gradient,
    selectedBackgroundImage: String,
    selectedColor: String,
    selectedSubtitleColor: String,
    selectionStyle: Double,
    setBubbleParent: Boolean => Callback,
    setEditActions: js.Array[RowActionType] => Callback,
    setSelectedColor: String => Callback,
    setSelectedSubtitleColor: String => Callback,
    subtitle: String,
    subtitleColor: String,
    title: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): ListItem = {
    val __obj = js.Dynamic.literal(accessoryType = accessoryType.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundGradient = backgroundGradient.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], canEdit = canEdit.asInstanceOf[js.Any], canInsert = canInsert.asInstanceOf[js.Any], canMove = canMove.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], editActions = editActions.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], searchableText = searchableText.asInstanceOf[js.Any], selectedBackgroundColor = selectedBackgroundColor.asInstanceOf[js.Any], selectedBackgroundGradient = selectedBackgroundGradient.asInstanceOf[js.Any], selectedBackgroundImage = selectedBackgroundImage.asInstanceOf[js.Any], selectedColor = selectedColor.asInstanceOf[js.Any], selectedSubtitleColor = selectedSubtitleColor.asInstanceOf[js.Any], selectionStyle = selectionStyle.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], subtitleColor = subtitleColor.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getEditActions")(getEditActions.toJsFn)
    __obj.updateDynamic("getSelectedColor")(getSelectedColor.toJsFn)
    __obj.updateDynamic("getSelectedSubtitleColor")(getSelectedSubtitleColor.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setEditActions")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.titanium.RowActionType]) => setEditActions(t0).runNow()))
    __obj.updateDynamic("setSelectedColor")(js.Any.fromFunction1((t0: java.lang.String) => setSelectedColor(t0).runNow()))
    __obj.updateDynamic("setSelectedSubtitleColor")(js.Any.fromFunction1((t0: java.lang.String) => setSelectedSubtitleColor(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
}

