package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @class
  * @name pc.ElementComponent
  * @augments pc.Component
  * @classdesc Enables an Entity to be positioned using anchors and screen coordinates under a {@link pc.ScreenComponent} or under other ElementComponents.
  * Depending on its type it can be used to render images, text or just as a layout mechanism to build 2D and 3D user interfaces.
  * If the component is a descendant of a {@link pc.ScreenComponent}, then the Entity's {@link pc.Entity.setLocalPosition} is in the {@link pc.ScreenComponent}'s coordinate system.
  * @param {pc.ElementComponentSystem} system - The ComponentSystem that created this Component.
  * @param {pc.Entity} entity - The Entity that this Component is attached to.
  * @property {string} type The type of the ElementComponent. Can be:
  *
  * * {@link pc.ELEMENTTYPE_GROUP}: The component can be used as a layout mechanism to create groups of ElementComponents e.g. panels.
  * * {@link pc.ELEMENTTYPE_IMAGE}: The component will render an image
  * * {@link pc.ELEMENTTYPE_TEXT}: The component will render text
  *
  * @property {pc.Entity} screen The Entity with a {@link pc.ScreenComponent} that this component belongs to. This is automatically set when the component is a child of a ScreenComponent.
  * @property {number} drawOrder The draw order of the component. A higher value means that the component will be rendered on top of other components.
  * @property {pc.Vec4} anchor Specifies where the left, bottom, right and top edges of the component are anchored relative to its parent. Each value
  * ranges from 0 to 1. E.g. a value of [0,0,0,0] means that the element will be anchored to the bottom left of its parent. A value of [1, 1, 1, 1] means
  * it will be anchored to the top right. A split anchor is when the left-right or top-bottom pairs of the anchor are not equal. In that case the component will be resized to cover that entire area. E.g. a value of [0,0,1,1] will make the component resize exactly as its parent.
  * @property {pc.Vec2} pivot The position of the pivot of the component relative to its anchor. Each value ranges from 0 to 1 where [0,0] is the bottom left and [1,1] is the top right.
  * @property {pc.Vec4} margin The distance from the left, bottom, right and top edges of the anchor. For example if we are using a split anchor like [0,0,1,1] and the margin is [0,0,0,0] then the component will be the same width and height as its parent.
  * @property {number} left The distance from the left edge of the anchor. Can be used in combination with a split anchor to make the component's left edge always be 'left' units away from the left.
  * @property {number} right The distance from the right edge of the anchor. Can be used in combination with a split anchor to make the component's right edge always be 'right' units away from the right.
  * @property {number} bottom The distance from the bottom edge of the anchor. Can be used in combination with a split anchor to make the component's top edge always be 'top' units away from the top.
  * @property {number} top The distance from the top edge of the anchor. Can be used in combination with a split anchor to make the component's bottom edge always be 'bottom' units away from the bottom.
  * @property {number} width The width of the element as set in the editor. Note that in some cases this may not reflect the true width at which the element is rendered, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. See `calculatedWidth` in order to ensure you are reading the true width at which the element will be rendered.
  * @property {number} height The height of the element as set in the editor. Note that in some cases this may not reflect the true height at which the element is rendered, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. See `calculatedHeight` in order to ensure you are reading the true height at which the element will be rendered.
  * @property {number} calculatedWidth The width at which the element will be rendered. In most cases this will be the same as `width`. However, in some cases the engine may calculate a different width for the element, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. In these scenarios, `calculatedWidth` may be smaller or larger than the width that was set in the editor.
  * @property {number} calculatedHeight The height at which the element will be rendered. In most cases this will be the same as `height`. However, in some cases the engine may calculate a different height for the element, such as when the element is under the control of a {@link pc.LayoutGroupComponent}. In these scenarios, `calculatedHeight` may be smaller or larger than the height that was set in the editor.
  * @property {pc.Vec3[]} screenCorners An array of 4 {@link pc.Vec3}s that represent the bottom left, bottom right, top right and top left corners of the component relative to its parent {@link pc.ScreenComponent}.
  * @property {pc.Vec3[]} worldCorners An array of 4 {@link pc.Vec3}s that represent the bottom left, bottom right, top right and top left corners of the component in world space. Only works for 3D ElementComponents.
  * @property {pc.Vec2[]} canvasCorners An array of 4 {@link pc.Vec2}s that represent the bottom left, bottom right, top right and top left corners of the component in canvas pixels. Only works for screen space ElementComponents.
  * @property {boolean} useInput If true then the component will receive Mouse or Touch input events.
  * @property {pc.Color} color The color of the image for {@link pc.ELEMENTTYPE_IMAGE} types or the color of the text for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {number} opacity The opacity of the image for {@link pc.ELEMENTTYPE_IMAGE} types or the text for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {pc.Color} outlineColor The text outline effect color and opacity. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {number} outlineThickness The width of the text outline effect. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {pc.Color} shadowColor The text shadow effect color and opacity. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {pc.Vec2} shadowOffset The text shadow effect shift amount from original text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {number} textWidth The width of the text rendered by the component. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {number} textHeight The height of the text rendered by the component. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {number} autoWidth Automatically set the width of the component to be the same as the textWidth. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {number} autoHeight Automatically set the height of the component to be the same as the textHeight. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {number} fontAsset The id of the font asset used for rendering the text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {pc.Font} font The font used for rendering the text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {number} fontSize The size of the font. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {boolean} autoFitWidth When true the font size and line height will scale so that the text fits inside the width of the Element. The font size will be scaled between minFontSize and maxFontSize. The value of autoFitWidth will be ignored if autoWidth is true.
  * @property {boolean} autoFitHeight When true the font size and line height will scale so that the text fits inside the height of the Element. The font size will be scaled between minFontSize and maxFontSize. The value of autoFitHeight will be ignored if autoHeight is true.
  * @property {number} minFontSize The minimum size that the font can scale to when autoFitWidth or autoFitHeight are true.
  * @property {number} maxFontSize The maximum size that the font can scale to when autoFitWidth or autoFitHeight are true.
  * @property {number} spacing The spacing between the letters of the text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {number} lineHeight The height of each line of text. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {boolean} wrapLines Whether to automatically wrap lines based on the element width. Only works for {@link pc.ELEMENTTYPE_TEXT} types, and when autoWidth is set to false.
  * @property {number} maxLines The maximum number of lines that the Element can wrap to. Any leftover text will be appended to the last line. Set this to null to allow unlimited lines.
  * @property {pc.Vec2} alignment The horizontal and vertical alignment of the text. Values range from 0 to 1 where [0,0] is the bottom left and [1,1] is the top right.  Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {string} text The text to render. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {string} key The localization key to use to get the localized text from {@link pc.Application#i18n}. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {number} textureAsset The id of the texture asset to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property {pc.Texture} texture The texture to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property {number} spriteAsset The id of the sprite asset to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types which can render either a texture or a sprite.
  * @property {pc.Sprite} sprite The sprite to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types which can render either a texture or a sprite.
  * @property {number} spriteFrame The frame of the sprite to render. Only works for {@link pc.ELEMENTTYPE_IMAGE} types who have a sprite assigned.
  * @property {number} pixelsPerUnit The number of pixels that map to one PlayCanvas unit. Only works for {@link pc.ELEMENTTYPE_IMAGE} types who have a sliced sprite assigned.
  * @property {number} materialAsset The id of the material asset to use when rendering an image. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property {pc.Material} material The material to use when rendering an image. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property {pc.Vec4} rect Specifies which region of the texture to use in order to render an image. Values range from 0 to 1 and indicate u, v, width, height. Only works for {@link pc.ELEMENTTYPE_IMAGE} types.
  * @property {boolean} rtlReorder Reorder the text for RTL languages using a function registered by `app.systems.element.registerUnicodeConverter`.
  * @property {boolean} unicodeConverter Convert unicode characters using a function registered by `app.systems.element.registerUnicodeConverter`.
  * @property {number} batchGroupId Assign element to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
  * @property {number[]} layers An array of layer IDs ({@link pc.Layer#id}) to which this element should belong.
  * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  * @property {boolean} enableMarkup Flag for enabling markup processing. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {number} rangeStart Index of the first character to render. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  * @property {number} rangeEnd Index of the last character to render. Only works for {@link pc.ELEMENTTYPE_TEXT} types.
  */
@JSImport("playcanvas", "ElementComponent")
@js.native
class ElementComponent protected ()
  extends typingsJapgolly.playcanvas.pc.ElementComponent {
  def this(
    system: typingsJapgolly.playcanvas.pc.ElementComponentSystem,
    entity: typingsJapgolly.playcanvas.pc.Entity
  ) = this()
}

