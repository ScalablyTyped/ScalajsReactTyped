package typingsJapgolly.rcMentions

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.rcMentions.anon.PartialMentionsPropsRefAt
import typingsJapgolly.rcMentions.anon.WeakValidationMapMentions
import typingsJapgolly.rcMentions.esMentionsMod.MentionsProps
import typingsJapgolly.rcMentions.esMentionsMod.MentionsRef
import typingsJapgolly.rcMentions.esOptionMod.OptionProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined react.react.ForwardRefExoticComponent<rc-mentions.rc-mentions/es/Mentions.MentionsProps & react.react.RefAttributes<rc-mentions.rc-mentions/es/Mentions.MentionsRef>> & {  Option :react.react.FC<rc-mentions.rc-mentions/es/Option.OptionProps>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: MentionsProps & RefAttributes[MentionsRef]): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("rc-mentions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-mentions", "default.Option")
    @js.native
    def Option: FC[OptionProps] = js.native
    inline def Option_=(x: FC[OptionProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-mentions", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialMentionsPropsRefAt] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialMentionsPropsRefAt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-mentions", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-mentions", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapMentions] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapMentions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-mentions", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
}
