package typingsJapgolly.officeUiFabricReact.comboBoxTypesMod

import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typingsJapgolly.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComboBoxOptionStyles extends IButtonStyles {
  /**
    * Styles for the text inside the comboBox option.
    * This should be used instead of the description
    * inside IButtonStyles because we custom render the text
    * in the comboBox options.
    */
  var optionText: IStyle
  /**
    * Styles for the comboBox option text's wrapper.
    */
  var optionTextWrapper: IStyle
}

object IComboBoxOptionStyles {
  @scala.inline
  def apply(
    description: IStyle = null,
    descriptionChecked: IStyle = null,
    descriptionDisabled: IStyle = null,
    descriptionHovered: IStyle = null,
    descriptionPressed: IStyle = null,
    flexContainer: IStyle = null,
    icon: IStyle = null,
    iconChecked: IStyle = null,
    iconDisabled: IStyle = null,
    iconExpanded: IStyle = null,
    iconExpandedHovered: IStyle = null,
    iconHovered: IStyle = null,
    iconPressed: IStyle = null,
    label: IStyle = null,
    labelChecked: IStyle = null,
    labelDisabled: IStyle = null,
    labelHovered: IStyle = null,
    menuIcon: IStyle = null,
    menuIconChecked: IStyle = null,
    menuIconDisabled: IStyle = null,
    menuIconExpanded: IStyle = null,
    menuIconExpandedHovered: IStyle = null,
    menuIconHovered: IStyle = null,
    menuIconPressed: IStyle = null,
    optionText: IStyle = null,
    optionTextWrapper: IStyle = null,
    root: IStyle = null,
    rootChecked: IStyle = null,
    rootCheckedDisabled: IStyle = null,
    rootCheckedHovered: IStyle = null,
    rootCheckedPressed: IStyle = null,
    rootDisabled: IStyle = null,
    rootExpanded: IStyle = null,
    rootExpandedHovered: IStyle = null,
    rootFocused: IStyle = null,
    rootHasMenu: IStyle = null,
    rootHovered: IStyle = null,
    rootPressed: IStyle = null,
    screenReaderText: IStyle = null,
    secondaryText: IStyle = null,
    splitButtonContainer: IStyle = null,
    splitButtonContainerChecked: IStyle = null,
    splitButtonContainerCheckedHovered: IStyle = null,
    splitButtonContainerDisabled: IStyle = null,
    splitButtonContainerFocused: IStyle = null,
    splitButtonContainerHovered: IStyle = null,
    splitButtonDivider: IStyle = null,
    splitButtonDividerDisabled: IStyle = null,
    splitButtonFlexContainer: IStyle = null,
    splitButtonMenuButton: IStyle = null,
    splitButtonMenuButtonChecked: IStyle = null,
    splitButtonMenuButtonDisabled: IStyle = null,
    splitButtonMenuButtonExpanded: IStyle = null,
    splitButtonMenuIcon: IStyle = null,
    splitButtonMenuIconDisabled: IStyle = null,
    textContainer: IStyle = null
  ): IComboBoxOptionStyles = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (descriptionChecked != null) __obj.updateDynamic("descriptionChecked")(descriptionChecked.asInstanceOf[js.Any])
    if (descriptionDisabled != null) __obj.updateDynamic("descriptionDisabled")(descriptionDisabled.asInstanceOf[js.Any])
    if (descriptionHovered != null) __obj.updateDynamic("descriptionHovered")(descriptionHovered.asInstanceOf[js.Any])
    if (descriptionPressed != null) __obj.updateDynamic("descriptionPressed")(descriptionPressed.asInstanceOf[js.Any])
    if (flexContainer != null) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconChecked != null) __obj.updateDynamic("iconChecked")(iconChecked.asInstanceOf[js.Any])
    if (iconDisabled != null) __obj.updateDynamic("iconDisabled")(iconDisabled.asInstanceOf[js.Any])
    if (iconExpanded != null) __obj.updateDynamic("iconExpanded")(iconExpanded.asInstanceOf[js.Any])
    if (iconExpandedHovered != null) __obj.updateDynamic("iconExpandedHovered")(iconExpandedHovered.asInstanceOf[js.Any])
    if (iconHovered != null) __obj.updateDynamic("iconHovered")(iconHovered.asInstanceOf[js.Any])
    if (iconPressed != null) __obj.updateDynamic("iconPressed")(iconPressed.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelChecked != null) __obj.updateDynamic("labelChecked")(labelChecked.asInstanceOf[js.Any])
    if (labelDisabled != null) __obj.updateDynamic("labelDisabled")(labelDisabled.asInstanceOf[js.Any])
    if (labelHovered != null) __obj.updateDynamic("labelHovered")(labelHovered.asInstanceOf[js.Any])
    if (menuIcon != null) __obj.updateDynamic("menuIcon")(menuIcon.asInstanceOf[js.Any])
    if (menuIconChecked != null) __obj.updateDynamic("menuIconChecked")(menuIconChecked.asInstanceOf[js.Any])
    if (menuIconDisabled != null) __obj.updateDynamic("menuIconDisabled")(menuIconDisabled.asInstanceOf[js.Any])
    if (menuIconExpanded != null) __obj.updateDynamic("menuIconExpanded")(menuIconExpanded.asInstanceOf[js.Any])
    if (menuIconExpandedHovered != null) __obj.updateDynamic("menuIconExpandedHovered")(menuIconExpandedHovered.asInstanceOf[js.Any])
    if (menuIconHovered != null) __obj.updateDynamic("menuIconHovered")(menuIconHovered.asInstanceOf[js.Any])
    if (menuIconPressed != null) __obj.updateDynamic("menuIconPressed")(menuIconPressed.asInstanceOf[js.Any])
    if (optionText != null) __obj.updateDynamic("optionText")(optionText.asInstanceOf[js.Any])
    if (optionTextWrapper != null) __obj.updateDynamic("optionTextWrapper")(optionTextWrapper.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootChecked != null) __obj.updateDynamic("rootChecked")(rootChecked.asInstanceOf[js.Any])
    if (rootCheckedDisabled != null) __obj.updateDynamic("rootCheckedDisabled")(rootCheckedDisabled.asInstanceOf[js.Any])
    if (rootCheckedHovered != null) __obj.updateDynamic("rootCheckedHovered")(rootCheckedHovered.asInstanceOf[js.Any])
    if (rootCheckedPressed != null) __obj.updateDynamic("rootCheckedPressed")(rootCheckedPressed.asInstanceOf[js.Any])
    if (rootDisabled != null) __obj.updateDynamic("rootDisabled")(rootDisabled.asInstanceOf[js.Any])
    if (rootExpanded != null) __obj.updateDynamic("rootExpanded")(rootExpanded.asInstanceOf[js.Any])
    if (rootExpandedHovered != null) __obj.updateDynamic("rootExpandedHovered")(rootExpandedHovered.asInstanceOf[js.Any])
    if (rootFocused != null) __obj.updateDynamic("rootFocused")(rootFocused.asInstanceOf[js.Any])
    if (rootHasMenu != null) __obj.updateDynamic("rootHasMenu")(rootHasMenu.asInstanceOf[js.Any])
    if (rootHovered != null) __obj.updateDynamic("rootHovered")(rootHovered.asInstanceOf[js.Any])
    if (rootPressed != null) __obj.updateDynamic("rootPressed")(rootPressed.asInstanceOf[js.Any])
    if (screenReaderText != null) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (splitButtonContainer != null) __obj.updateDynamic("splitButtonContainer")(splitButtonContainer.asInstanceOf[js.Any])
    if (splitButtonContainerChecked != null) __obj.updateDynamic("splitButtonContainerChecked")(splitButtonContainerChecked.asInstanceOf[js.Any])
    if (splitButtonContainerCheckedHovered != null) __obj.updateDynamic("splitButtonContainerCheckedHovered")(splitButtonContainerCheckedHovered.asInstanceOf[js.Any])
    if (splitButtonContainerDisabled != null) __obj.updateDynamic("splitButtonContainerDisabled")(splitButtonContainerDisabled.asInstanceOf[js.Any])
    if (splitButtonContainerFocused != null) __obj.updateDynamic("splitButtonContainerFocused")(splitButtonContainerFocused.asInstanceOf[js.Any])
    if (splitButtonContainerHovered != null) __obj.updateDynamic("splitButtonContainerHovered")(splitButtonContainerHovered.asInstanceOf[js.Any])
    if (splitButtonDivider != null) __obj.updateDynamic("splitButtonDivider")(splitButtonDivider.asInstanceOf[js.Any])
    if (splitButtonDividerDisabled != null) __obj.updateDynamic("splitButtonDividerDisabled")(splitButtonDividerDisabled.asInstanceOf[js.Any])
    if (splitButtonFlexContainer != null) __obj.updateDynamic("splitButtonFlexContainer")(splitButtonFlexContainer.asInstanceOf[js.Any])
    if (splitButtonMenuButton != null) __obj.updateDynamic("splitButtonMenuButton")(splitButtonMenuButton.asInstanceOf[js.Any])
    if (splitButtonMenuButtonChecked != null) __obj.updateDynamic("splitButtonMenuButtonChecked")(splitButtonMenuButtonChecked.asInstanceOf[js.Any])
    if (splitButtonMenuButtonDisabled != null) __obj.updateDynamic("splitButtonMenuButtonDisabled")(splitButtonMenuButtonDisabled.asInstanceOf[js.Any])
    if (splitButtonMenuButtonExpanded != null) __obj.updateDynamic("splitButtonMenuButtonExpanded")(splitButtonMenuButtonExpanded.asInstanceOf[js.Any])
    if (splitButtonMenuIcon != null) __obj.updateDynamic("splitButtonMenuIcon")(splitButtonMenuIcon.asInstanceOf[js.Any])
    if (splitButtonMenuIconDisabled != null) __obj.updateDynamic("splitButtonMenuIconDisabled")(splitButtonMenuIconDisabled.asInstanceOf[js.Any])
    if (textContainer != null) __obj.updateDynamic("textContainer")(textContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxOptionStyles]
  }
}

