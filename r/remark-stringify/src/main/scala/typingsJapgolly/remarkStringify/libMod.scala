package typingsJapgolly.remarkStringify

import typingsJapgolly.mdast.mod.Content
import typingsJapgolly.mdast.mod.Root
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Handlers
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Join
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Unsafe
import typingsJapgolly.remarkStringify.remarkStringifyStrings.Asterisk
import typingsJapgolly.remarkStringify.remarkStringifyStrings.Dot
import typingsJapgolly.remarkStringify.remarkStringifyStrings.Graveaccent
import typingsJapgolly.remarkStringify.remarkStringifyStrings.Plussign
import typingsJapgolly.remarkStringify.remarkStringifyStrings.Quotationmark
import typingsJapgolly.remarkStringify.remarkStringifyStrings.Tilde
import typingsJapgolly.remarkStringify.remarkStringifyStrings._underscore
import typingsJapgolly.remarkStringify.remarkStringifyStrings.`-_`
import typingsJapgolly.remarkStringify.remarkStringifyStrings.mixed
import typingsJapgolly.remarkStringify.remarkStringifyStrings.one
import typingsJapgolly.remarkStringify.remarkStringifyStrings.tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("remark-stringify/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Unit): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Node = Root | Content
  
  /* Inlined std.Omit<remark-stringify.remark-stringify/lib.ToMarkdownOptions, 'extensions'> */
  trait Options extends StObject {
    
    var bullet: js.UndefOr[`-_` | Asterisk | Plussign] = js.undefined
    
    var bulletOrdered: js.UndefOr[Dot | (/* ) */ String)] = js.undefined
    
    var bulletOrderedOther: js.UndefOr[Dot | (/* ) */ String)] = js.undefined
    
    var bulletOther: js.UndefOr[`-_` | Asterisk | Plussign] = js.undefined
    
    var closeAtx: js.UndefOr[Boolean] = js.undefined
    
    var emphasis: js.UndefOr[Asterisk | _underscore] = js.undefined
    
    var fence: js.UndefOr[Tilde | Graveaccent] = js.undefined
    
    var fences: js.UndefOr[Boolean] = js.undefined
    
    var handlers: js.UndefOr[Handlers] = js.undefined
    
    var incrementListMarker: js.UndefOr[Boolean] = js.undefined
    
    var join: js.UndefOr[js.Array[Join]] = js.undefined
    
    var listItemIndent: js.UndefOr[tab | one | mixed] = js.undefined
    
    var quote: js.UndefOr[Quotationmark | (/* ' */ String)] = js.undefined
    
    var resourceLink: js.UndefOr[Boolean] = js.undefined
    
    var rule: js.UndefOr[`-_` | Asterisk | _underscore] = js.undefined
    
    var ruleRepetition: js.UndefOr[Double] = js.undefined
    
    var ruleSpaces: js.UndefOr[Boolean] = js.undefined
    
    var setext: js.UndefOr[Boolean] = js.undefined
    
    var strong: js.UndefOr[Asterisk | _underscore] = js.undefined
    
    var tightDefinitions: js.UndefOr[Boolean] = js.undefined
    
    var unsafe: js.UndefOr[js.Array[Unsafe]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBullet(value: `-_` | Asterisk | Plussign): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      inline def setBulletOrdered(value: Dot | (/* ) */ String)): Self = StObject.set(x, "bulletOrdered", value.asInstanceOf[js.Any])
      
      inline def setBulletOrderedOther(value: Dot | (/* ) */ String)): Self = StObject.set(x, "bulletOrderedOther", value.asInstanceOf[js.Any])
      
      inline def setBulletOrderedOtherUndefined: Self = StObject.set(x, "bulletOrderedOther", js.undefined)
      
      inline def setBulletOrderedUndefined: Self = StObject.set(x, "bulletOrdered", js.undefined)
      
      inline def setBulletOther(value: `-_` | Asterisk | Plussign): Self = StObject.set(x, "bulletOther", value.asInstanceOf[js.Any])
      
      inline def setBulletOtherUndefined: Self = StObject.set(x, "bulletOther", js.undefined)
      
      inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      inline def setCloseAtx(value: Boolean): Self = StObject.set(x, "closeAtx", value.asInstanceOf[js.Any])
      
      inline def setCloseAtxUndefined: Self = StObject.set(x, "closeAtx", js.undefined)
      
      inline def setEmphasis(value: Asterisk | _underscore): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
      
      inline def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
      
      inline def setFence(value: Tilde | Graveaccent): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
      
      inline def setFenceUndefined: Self = StObject.set(x, "fence", js.undefined)
      
      inline def setFences(value: Boolean): Self = StObject.set(x, "fences", value.asInstanceOf[js.Any])
      
      inline def setFencesUndefined: Self = StObject.set(x, "fences", js.undefined)
      
      inline def setHandlers(value: Handlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setIncrementListMarker(value: Boolean): Self = StObject.set(x, "incrementListMarker", value.asInstanceOf[js.Any])
      
      inline def setIncrementListMarkerUndefined: Self = StObject.set(x, "incrementListMarker", js.undefined)
      
      inline def setJoin(value: js.Array[Join]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setJoinVarargs(value: Join*): Self = StObject.set(x, "join", js.Array(value*))
      
      inline def setListItemIndent(value: tab | one | mixed): Self = StObject.set(x, "listItemIndent", value.asInstanceOf[js.Any])
      
      inline def setListItemIndentUndefined: Self = StObject.set(x, "listItemIndent", js.undefined)
      
      inline def setQuote(value: Quotationmark | (/* ' */ String)): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setResourceLink(value: Boolean): Self = StObject.set(x, "resourceLink", value.asInstanceOf[js.Any])
      
      inline def setResourceLinkUndefined: Self = StObject.set(x, "resourceLink", js.undefined)
      
      inline def setRule(value: `-_` | Asterisk | _underscore): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleRepetition(value: Double): Self = StObject.set(x, "ruleRepetition", value.asInstanceOf[js.Any])
      
      inline def setRuleRepetitionUndefined: Self = StObject.set(x, "ruleRepetition", js.undefined)
      
      inline def setRuleSpaces(value: Boolean): Self = StObject.set(x, "ruleSpaces", value.asInstanceOf[js.Any])
      
      inline def setRuleSpacesUndefined: Self = StObject.set(x, "ruleSpaces", js.undefined)
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setSetext(value: Boolean): Self = StObject.set(x, "setext", value.asInstanceOf[js.Any])
      
      inline def setSetextUndefined: Self = StObject.set(x, "setext", js.undefined)
      
      inline def setStrong(value: Asterisk | _underscore): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setTightDefinitions(value: Boolean): Self = StObject.set(x, "tightDefinitions", value.asInstanceOf[js.Any])
      
      inline def setTightDefinitionsUndefined: Self = StObject.set(x, "tightDefinitions", js.undefined)
      
      inline def setUnsafe(value: js.Array[Unsafe]): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      inline def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
      
      inline def setUnsafeVarargs(value: Unsafe*): Self = StObject.set(x, "unsafe", js.Array(value*))
    }
  }
  
  type ToMarkdownOptions = typingsJapgolly.mdastUtilToMarkdown.mod.Options
}
