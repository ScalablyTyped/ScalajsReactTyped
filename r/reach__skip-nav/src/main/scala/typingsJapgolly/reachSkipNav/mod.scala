package typingsJapgolly.reachSkipNav

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reachPolymorphic.mod.ForwardRefComponent
import typingsJapgolly.reachSkipNav.reachSkipNavStrings.a
import typingsJapgolly.reachSkipNav.reachSkipNavStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * SkipNavContent
    *
    * Renders a div as the target for the link.
    *
    * @see Docs https://reach.tech/skip-nav#skipnavcontent
    */
  @JSImport("@reach/skip-nav", "SkipNavContent")
  @js.native
  val SkipNavContent: ForwardRefComponent[div, SkipNavContentProps] = js.native
  
  /**
    * SkipNavLink
    *
    * Renders a link that remains hidden until focused to skip to the main content.
    *
    * @see Docs https://reach.tech/skip-nav#skipnavlink
    */
  @JSImport("@reach/skip-nav", "SkipNavLink")
  @js.native
  val SkipNavLink: ForwardRefComponent[a, SkipNavLinkProps] = js.native
  
  /**
    * @see Docs https://reach.tech/skip-nav#skipnavcontent-props
    */
  trait SkipNavContentProps extends StObject {
    
    /**
      * You can place the `SkipNavContent` element as a sibling to your main
      * content or as a wrapper.
      *
      * Keep in mind it renders a `div`, so it may mess with your CSS depending on
      * where it’s placed.
      *
      * @example
      *   <SkipNavContent />
      *   <YourMainContent />
      *   // vs.
      *   <SkipNavContent>
      *     <YourMainContent/>
      *   </SkipNavContent>
      *
      * @see Docs https://reach.tech/skip-nav#skipnavcontent-children
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * An alternative ID. If used, the same value must be provided to the
      * `contentId` prop in `SkipNavLink`.
      *
      * @see Docs https://reach.tech/skip-nav#skipnavcontent-id
      */
    var id: js.UndefOr[String] = js.undefined
  }
  object SkipNavContentProps {
    
    inline def apply(): SkipNavContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipNavContentProps]
    }
    
    extension [Self <: SkipNavContentProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/skip-nav#skipnavlink-props
    */
  trait SkipNavLinkProps extends StObject {
    
    /**
      * Allows you to change the text for your preferred phrase or localization.
      *
      * @see Docs https://reach.tech/skip-nav#skipnavlink-children
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * An alternative ID for `SkipNavContent`. If used, the same value must be
      * provided to the `id` prop in `SkipNavContent`.
      *
      * @see Docs https://reach.tech/skip-nav#skipnavlink-contentid
      */
    var contentId: js.UndefOr[String] = js.undefined
  }
  object SkipNavLinkProps {
    
    inline def apply(): SkipNavLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipNavLinkProps]
    }
    
    extension [Self <: SkipNavLinkProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    }
  }
}
