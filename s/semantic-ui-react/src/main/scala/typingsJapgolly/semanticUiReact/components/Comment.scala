package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentActionMod.CommentActionProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentActionsMod.CommentActionsProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentAuthorMod.CommentAuthorProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentAvatarMod.CommentAvatarProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentContentMod.CommentContentProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentGroupMod.CommentGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentMetadataMod.CommentMetadataProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentMod.CommentProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentTextMod.CommentTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Comment {
  
  object Action {
    
    @JSImport("semantic-ui-react", "Comment.Action")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Action.type): SharedBuilder_CommentActionProps_429173259[typingsJapgolly.semanticUiReact.mod.Comment.Action] = new SharedBuilder_CommentActionProps_429173259[typingsJapgolly.semanticUiReact.mod.Comment.Action](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentActionProps): SharedBuilder_CommentActionProps_429173259[typingsJapgolly.semanticUiReact.mod.Comment.Action] = new SharedBuilder_CommentActionProps_429173259[typingsJapgolly.semanticUiReact.mod.Comment.Action](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Actions {
    
    @JSImport("semantic-ui-react", "Comment.Actions")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Actions.type): SharedBuilder_CommentActionsProps1235531893 = new SharedBuilder_CommentActionsProps1235531893(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentActionsProps): SharedBuilder_CommentActionsProps1235531893 = new SharedBuilder_CommentActionsProps1235531893(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Author {
    
    @JSImport("semantic-ui-react", "Comment.Author")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Author.type): SharedBuilder_CommentAuthorProps2008339147 = new SharedBuilder_CommentAuthorProps2008339147(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentAuthorProps): SharedBuilder_CommentAuthorProps2008339147 = new SharedBuilder_CommentAuthorProps2008339147(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Avatar {
    
    @JSImport("semantic-ui-react", "Comment.Avatar")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Avatar.type): SharedBuilder_CommentAvatarProps101166801 = new SharedBuilder_CommentAvatarProps101166801(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentAvatarProps): SharedBuilder_CommentAvatarProps101166801 = new SharedBuilder_CommentAvatarProps101166801(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Content {
    
    @JSImport("semantic-ui-react", "Comment.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_CommentContentProps823034598 = new SharedBuilder_CommentContentProps823034598(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentContentProps): SharedBuilder_CommentContentProps823034598 = new SharedBuilder_CommentContentProps823034598(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Group {
    
    @JSImport("semantic-ui-react", "Comment.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_CommentGroupProps464793707 = new SharedBuilder_CommentGroupProps464793707(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentGroupProps): SharedBuilder_CommentGroupProps464793707 = new SharedBuilder_CommentGroupProps464793707(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Metadata {
    
    @JSImport("semantic-ui-react", "Comment.Metadata")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Metadata.type): SharedBuilder_CommentMetadataProps1690422229 = new SharedBuilder_CommentMetadataProps1690422229(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentMetadataProps): SharedBuilder_CommentMetadataProps1690422229 = new SharedBuilder_CommentMetadataProps1690422229(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Text {
    
    @JSImport("semantic-ui-react", "Comment.Text")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Text.type): SharedBuilder_CommentTextProps_1826269331 = new SharedBuilder_CommentTextProps_1826269331(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentTextProps): SharedBuilder_CommentTextProps_1826269331 = new SharedBuilder_CommentTextProps_1826269331(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Comment")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Comment.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CommentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
