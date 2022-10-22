package typingsJapgolly.vkOpenapi.vk.OpenAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Observer {
  
  @js.native
  trait API extends StObject {
    
    def subscribe[E /* <: ObserverEvent */](event: E, handler: ObserverEventHandler[E]): Unit = js.native
    
    def unsubscribe[E /* <: ObserverEvent */](event: E): Unit = js.native
    def unsubscribe[E /* <: ObserverEvent */](event: E, handler: ObserverEventHandler[E]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.authDotlogin
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.authDotlogout
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.authDotstatusChange
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.authDotsessionChange
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotnew_comment
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotdelete_comment
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotjoined
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotleaved
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotliked
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunliked
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotshared
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunshared
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotsubscribed
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotunsubscribed
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotallowed
    - typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotdenied
  */
  trait ObserverEvent extends StObject
  object ObserverEvent {
    
    inline def authDotlogin: typingsJapgolly.vkOpenapi.vkOpenapiStrings.authDotlogin = "auth.login".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.authDotlogin]
    
    inline def authDotlogout: typingsJapgolly.vkOpenapi.vkOpenapiStrings.authDotlogout = "auth.logout".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.authDotlogout]
    
    inline def authDotsessionChange: typingsJapgolly.vkOpenapi.vkOpenapiStrings.authDotsessionChange = "auth.sessionChange".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.authDotsessionChange]
    
    inline def authDotstatusChange: typingsJapgolly.vkOpenapi.vkOpenapiStrings.authDotstatusChange = "auth.statusChange".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.authDotstatusChange]
    
    inline def widgetsDotallowMessagesFromCommunityDotallowed: typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotallowed = "widgets.allowMessagesFromCommunity.allowed".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotallowed]
    
    inline def widgetsDotallowMessagesFromCommunityDotdenied: typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotdenied = "widgets.allowMessagesFromCommunity.denied".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotdenied]
    
    inline def widgetsDotcommentsDotdelete_comment: typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotdelete_comment = "widgets.comments.delete_comment".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotdelete_comment]
    
    inline def widgetsDotcommentsDotnew_comment: typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotnew_comment = "widgets.comments.new_comment".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotnew_comment]
    
    inline def widgetsDotgroupsDotjoined: typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotjoined = "widgets.groups.joined".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotjoined]
    
    inline def widgetsDotgroupsDotleaved: typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotleaved = "widgets.groups.leaved".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotleaved]
    
    inline def widgetsDotlikeDotliked: typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotliked = "widgets.like.liked".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotliked]
    
    inline def widgetsDotlikeDotshared: typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotshared = "widgets.like.shared".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotshared]
    
    inline def widgetsDotlikeDotunliked: typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunliked = "widgets.like.unliked".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunliked]
    
    inline def widgetsDotlikeDotunshared: typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunshared = "widgets.like.unshared".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunshared]
    
    inline def widgetsDotsubscribed: typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotsubscribed = "widgets.subscribed".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotsubscribed]
    
    inline def widgetsDotunsubscribed: typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotunsubscribed = "widgets.unsubscribed".asInstanceOf[typingsJapgolly.vkOpenapi.vkOpenapiStrings.widgetsDotunsubscribed]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    E extends 'widgets.comments.new_comment' | 'widgets.comments.delete_comment' ? (num : number, lastComment : string, date : string, sign : string): void : E extends 'widgets.like.liked' | 'widgets.like.unliked' ? (likes : number): void : E extends 'widgets.like.shared' | 'widgets.like.unshared' ? (shares : number): void : E extends 'widgets.allowMessagesFromCommunity.allowed' | 'widgets.allowMessagesFromCommunity.denied' ? (uid : number): void : (): void
    }}}
    */
  @js.native
  trait ObserverEventHandler[E /* <: ObserverEvent */] extends StObject
}
