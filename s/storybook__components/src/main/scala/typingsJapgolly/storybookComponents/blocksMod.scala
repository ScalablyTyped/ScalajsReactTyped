package typingsJapgolly.storybookComponents

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLHeadingElement
import org.scalajs.dom.raw.HTMLTableElement
import typingsJapgolly.emotionStyledBase.mod.StyledComponent
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.TableHTMLAttributes
import typingsJapgolly.storybookComponents.colorPaletteMod.ColorProps
import typingsJapgolly.storybookComponents.descriptionMod.DescriptionProps
import typingsJapgolly.storybookComponents.iconGalleryMod.IconItemProps
import typingsJapgolly.storybookComponents.previewMod.PreviewProps
import typingsJapgolly.storybookComponents.propsTableMod.PropsTableProps
import typingsJapgolly.storybookComponents.sourceMod.SourceProps
import typingsJapgolly.storybookComponents.storyMod.StoryProps
import typingsJapgolly.storybookComponents.typesetMod.TypesetProps
import typingsJapgolly.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/blocks", JSImport.Namespace)
@js.native
object blocksMod extends js.Object {
  @js.native
  class IFrame ()
    extends typingsJapgolly.storybookComponents.iframeMod.IFrame
  
  val ColorItem: FunctionComponent[ColorProps] = js.native
  val ColorPalette: FunctionComponent[js.Object] = js.native
  val Description: FunctionComponent[DescriptionProps] = js.native
  val DocsContent: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  val DocsPageWrapper: FunctionComponent[js.Object] = js.native
  val DocsWrapper: StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], js.Object, Theme] = js.native
  val IconGallery: FunctionComponent[js.Object] = js.native
  val IconItem: FunctionComponent[IconItemProps] = js.native
  /**
    * A preview component for showing one or more component `Story`
    * items. The preview also shows the source for the component
    * as a drop-down.
    */
  val Preview: FunctionComponent[PreviewProps] = js.native
  /**
    * Display the props for a component as a props table. Each row is a collection of
    * PropDefs, usually derived from docgen info for the component.
    */
  val PropsTable: FC[PropsTableProps] = js.native
  /**
    * Syntax-highlighted source code for a component (or anything!)
    */
  val Source: FunctionComponent[SourceProps] = js.native
  /**
    * A story element, either renderend inline or in an iframe,
    * with configurable height.
    */
  val Story: FunctionComponent[StoryProps] = js.native
  val Subtitle: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  val Table: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    js.Object, 
    Theme
  ] = js.native
  val Title: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  val Typeset: FunctionComponent[TypesetProps] = js.native
  @js.native
  object PropsTableError extends js.Object {
    /* "No component found" */ val NO_COMPONENT: typingsJapgolly.storybookComponents.propsTableMod.PropsTableError.NO_COMPONENT with String = js.native
    /* "Props unsupported. See Props documentation for your framework." */ val PROPS_UNSUPPORTED: typingsJapgolly.storybookComponents.propsTableMod.PropsTableError.PROPS_UNSUPPORTED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.storybookComponents.propsTableMod.PropsTableError with String] = js.native
  }
  
  @js.native
  object SourceError extends js.Object {
    /* "There\\u2019s no story here." */ val NO_STORY: typingsJapgolly.storybookComponents.sourceMod.SourceError.NO_STORY with String = js.native
    /* "Oh no! The source is not available." */ val SOURCE_UNAVAILABLE: typingsJapgolly.storybookComponents.sourceMod.SourceError.SOURCE_UNAVAILABLE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.storybookComponents.sourceMod.SourceError with String] = js.native
  }
  
  @js.native
  object StoryError extends js.Object {
    /* "No component or story to display" */ val NO_STORY: typingsJapgolly.storybookComponents.storyMod.StoryError.NO_STORY with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.storybookComponents.storyMod.StoryError with String] = js.native
  }
  
}

