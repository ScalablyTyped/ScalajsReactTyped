package typingsJapgolly.markdownIt

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.markdownIt.libMod.MarkdownIt
import typingsJapgolly.markdownIt.libTokenMod.Nesting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesInlineStateInlineMod {
  
  @JSImport("markdown-it/lib/rules_inline/state_inline", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StateInline {
    def this(
      src: String,
      md: MarkdownIt,
      env: Any,
      outTokens: js.Array[typingsJapgolly.markdownIt.libTokenMod.^]
    ) = this()
    
    /* CompleteClass */
    var Token: Instantiable3[
        /* type */ String, 
        /* tag */ String, 
        /* nesting */ Nesting, 
        typingsJapgolly.markdownIt.libTokenMod.^
      ] = js.native
    
    /**
      * Stores { start: end } pairs. Useful for backtrack
      * optimization of pairs parse (emphasis, strikes).
      */
    /* CompleteClass */
    var cache: Any = js.native
    
    /**
      * List of emphasis-like delimiters for current tag
      */
    /* CompleteClass */
    var delimiters: js.Array[Delimiter] = js.native
    
    /* CompleteClass */
    var env: Any = js.native
    
    /* CompleteClass */
    var level: Double = js.native
    
    /* CompleteClass */
    var md: MarkdownIt = js.native
    
    /* CompleteClass */
    var pending: String = js.native
    
    /* CompleteClass */
    var pendingLevel: Double = js.native
    
    /* CompleteClass */
    var pos: Double = js.native
    
    /* CompleteClass */
    var posMax: Double = js.native
    
    /**
      * Push new token to "stream".
      * If pending text exists - flush it as text token
      */
    /* CompleteClass */
    override def push(`type`: String, tag: String, nesting: Nesting): typingsJapgolly.markdownIt.libTokenMod.^ = js.native
    
    // Stack of delimiter lists for upper level tags
    // _prev_delimiters: StateInline.Delimiter[][];
    /**
      * Flush pending text
      */
    /* CompleteClass */
    override def pushPending(): typingsJapgolly.markdownIt.libTokenMod.^ = js.native
    
    /**
      * Scan a sequence of emphasis-like markers, and determine whether
      * it can start an emphasis sequence or end an emphasis sequence.
      *
      * @param start position to scan from (it should point at a valid marker);
      * @param canSplitWord determine if these markers can be found inside a word
      */
    /* CompleteClass */
    override def scanDelims(start: Double, canSplitWord: Boolean): Scanned = js.native
    
    /* CompleteClass */
    var src: String = js.native
    
    /* CompleteClass */
    var tokens: js.Array[typingsJapgolly.markdownIt.libTokenMod.^] = js.native
    
    /* CompleteClass */
    var tokens_meta: js.Array[TokenMata | Null] = js.native
  }
  
  trait Delimiter extends StObject {
    
    var close: Boolean
    
    var end: Double
    
    var jump: Double
    
    var length: Double
    
    var marker: Double
    
    var open: Boolean
    
    var token: Double
  }
  object Delimiter {
    
    inline def apply(
      close: Boolean,
      end: Double,
      jump: Double,
      length: Double,
      marker: Double,
      open: Boolean,
      token: Double
    ): Delimiter = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], jump = jump.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delimiter]
    }
    
    extension [Self <: Delimiter](x: Self) {
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setJump(value: Double): Self = StObject.set(x, "jump", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: Double): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setToken(value: Double): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scanned extends StObject {
    
    var can_close: Boolean
    
    var can_open: Boolean
    
    var length: Double
  }
  object Scanned {
    
    inline def apply(can_close: Boolean, can_open: Boolean, length: Double): Scanned = {
      val __obj = js.Dynamic.literal(can_close = can_close.asInstanceOf[js.Any], can_open = can_open.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scanned]
    }
    
    extension [Self <: Scanned](x: Self) {
      
      inline def setCan_close(value: Boolean): Self = StObject.set(x, "can_close", value.asInstanceOf[js.Any])
      
      inline def setCan_open(value: Boolean): Self = StObject.set(x, "can_open", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait StateInline extends StObject {
    
    var Token: Instantiable3[
        /* type */ String, 
        /* tag */ String, 
        /* nesting */ Nesting, 
        typingsJapgolly.markdownIt.libTokenMod.^
      ]
    
    /**
      * Stores { start: end } pairs. Useful for backtrack
      * optimization of pairs parse (emphasis, strikes).
      */
    var cache: Any
    
    /**
      * List of emphasis-like delimiters for current tag
      */
    var delimiters: js.Array[Delimiter]
    
    var env: Any
    
    var level: Double
    
    var md: MarkdownIt
    
    var pending: String
    
    var pendingLevel: Double
    
    var pos: Double
    
    var posMax: Double
    
    /**
      * Push new token to "stream".
      * If pending text exists - flush it as text token
      */
    def push(`type`: String, tag: String, nesting: Nesting): typingsJapgolly.markdownIt.libTokenMod.^
    
    // Stack of delimiter lists for upper level tags
    // _prev_delimiters: StateInline.Delimiter[][];
    /**
      * Flush pending text
      */
    def pushPending(): typingsJapgolly.markdownIt.libTokenMod.^
    
    /**
      * Scan a sequence of emphasis-like markers, and determine whether
      * it can start an emphasis sequence or end an emphasis sequence.
      *
      * @param start position to scan from (it should point at a valid marker);
      * @param canSplitWord determine if these markers can be found inside a word
      */
    def scanDelims(start: Double, canSplitWord: Boolean): Scanned
    
    var src: String
    
    var tokens: js.Array[typingsJapgolly.markdownIt.libTokenMod.^]
    
    var tokens_meta: js.Array[TokenMata | Null]
  }
  object StateInline {
    
    inline def apply(
      Token: Instantiable3[
          /* type */ String, 
          /* tag */ String, 
          /* nesting */ Nesting, 
          typingsJapgolly.markdownIt.libTokenMod.^
        ],
      cache: Any,
      delimiters: js.Array[Delimiter],
      env: Any,
      level: Double,
      md: MarkdownIt,
      pending: String,
      pendingLevel: Double,
      pos: Double,
      posMax: Double,
      push: (String, String, Nesting) => typingsJapgolly.markdownIt.libTokenMod.^,
      pushPending: CallbackTo[typingsJapgolly.markdownIt.libTokenMod.^],
      scanDelims: (Double, Boolean) => Scanned,
      src: String,
      tokens: js.Array[typingsJapgolly.markdownIt.libTokenMod.^],
      tokens_meta: js.Array[TokenMata | Null]
    ): StateInline = {
      val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pendingLevel = pendingLevel.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], posMax = posMax.asInstanceOf[js.Any], push = js.Any.fromFunction3(push), pushPending = pushPending.toJsFn, scanDelims = js.Any.fromFunction2(scanDelims), src = src.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], tokens_meta = tokens_meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateInline]
    }
    
    extension [Self <: StateInline](x: Self) {
      
      inline def setCache(value: Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setDelimiters(value: js.Array[Delimiter]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersVarargs(value: Delimiter*): Self = StObject.set(x, "delimiters", js.Array(value*))
      
      inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMd(value: MarkdownIt): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setPending(value: String): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingLevel(value: Double): Self = StObject.set(x, "pendingLevel", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setPosMax(value: Double): Self = StObject.set(x, "posMax", value.asInstanceOf[js.Any])
      
      inline def setPush(value: (String, String, Nesting) => typingsJapgolly.markdownIt.libTokenMod.^): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
      
      inline def setPushPending(value: CallbackTo[typingsJapgolly.markdownIt.libTokenMod.^]): Self = StObject.set(x, "pushPending", value.toJsFn)
      
      inline def setScanDelims(value: (Double, Boolean) => Scanned): Self = StObject.set(x, "scanDelims", js.Any.fromFunction2(value))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setToken(
        value: Instantiable3[
              /* type */ String, 
              /* tag */ String, 
              /* nesting */ Nesting, 
              typingsJapgolly.markdownIt.libTokenMod.^
            ]
      ): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[typingsJapgolly.markdownIt.libTokenMod.^]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: typingsJapgolly.markdownIt.libTokenMod.^ *): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setTokens_meta(value: js.Array[TokenMata | Null]): Self = StObject.set(x, "tokens_meta", value.asInstanceOf[js.Any])
      
      inline def setTokens_metaVarargs(value: (TokenMata | Null)*): Self = StObject.set(x, "tokens_meta", js.Array(value*))
    }
  }
  
  trait TokenMata extends StObject {
    
    var delimiters: js.Array[Delimiter]
  }
  object TokenMata {
    
    inline def apply(delimiters: js.Array[Delimiter]): TokenMata = {
      val __obj = js.Dynamic.literal(delimiters = delimiters.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenMata]
    }
    
    extension [Self <: TokenMata](x: Self) {
      
      inline def setDelimiters(value: js.Array[Delimiter]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersVarargs(value: Delimiter*): Self = StObject.set(x, "delimiters", js.Array(value*))
    }
  }
}
