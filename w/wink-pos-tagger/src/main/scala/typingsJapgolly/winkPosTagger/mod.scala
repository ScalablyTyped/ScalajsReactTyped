package typingsJapgolly.winkPosTagger

import japgolly.scalajs.react.Callback
import typingsJapgolly.winkPosTagger.anon.Lemma
import typingsJapgolly.winkTokenizer.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wink-pos-tagger", JSImport.Namespace)
  @js.native
  /**
    * create a tagger instance
    */
  open class ^ ()
    extends StObject
       with Tagger {
    
    /**
      * This API has no effect. It has been maintained for compatibility purpose.
      * The wink-tokenizer will now always add lemma and normal forms.
      * Note, lemmas are added only for nouns (excluding proper noun), verbs and adjectives.
      * @param config configuration object
      * @returns object with active configuration
      */
    /* CompleteClass */
    override def defineConfig(config: Any): Lemma = js.native
    
    /**
      * Tags the input tokens with their pos.
      * In order to pos tag a sentence directly, use tagSentence API instead
      * @param tokens array of tokens, as produced by the wink tokenizer
      * @return pos tagged tokens
      */
    /* CompleteClass */
    override def tag(tokens: js.Array[Token]): js.Array[PosTaggedToken] = js.native
    
    /**
      * Tags the raw tokens with their pos.
      * Note, it only categorizes each token in to one of the following 3-categories (a) word, or (b) punctuation, or (c) number.
      * @param tokens to be pos tagged. They are simple array of string.
      * @return pos tagged tokens
      */
    /* CompleteClass */
    override def tagRawTokens(tokens: js.Array[String]): js.Array[PosTaggedToken] = js.native
    
    /**
      * Tokenizes the input sentence and tags the tokens.
      * @param sentence to be pos tagged
      * @return pos tagged tokens
      */
    /* CompleteClass */
    override def tagSentence(sentence: String): js.Array[PosTaggedToken] = js.native
    
    /**
      * Updates the internal lexicon using the input lexicon.
      * If a word/pos pair is found in the internal lexicon then it's value is updated with the new pos; otherwise it added.
      * @param lexicon object with word/pos pairs to be added or replaced in the existing lexicon.
      * @return pos tagged tokens
      */
    /* CompleteClass */
    override def updateLexicon(lexicon: js.Object): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.PRP
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.VBD
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.DT
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.JJ
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.NN
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.NNP
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.NNS
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.IN
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.VBG
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.Dot
  */
  trait PosTag extends StObject
  object PosTag {
    
    inline def DT: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.DT = "DT".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.DT]
    
    inline def Dot: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.Dot = ".".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.Dot]
    
    inline def IN: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.IN = "IN".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.IN]
    
    inline def JJ: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.JJ = "JJ".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.JJ]
    
    inline def NN: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.NN = "NN".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.NN]
    
    inline def NNP: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.NNP = "NNP".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.NNP]
    
    inline def NNS: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.NNS = "NNS".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.NNS]
    
    inline def PRP: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.PRP = "PRP".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.PRP]
    
    inline def VBD: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.VBD = "VBD".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.VBD]
    
    inline def VBG: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.VBG = "VBG".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.VBG]
  }
  
  trait PosTaggedToken extends StObject {
    
    var lemma: js.UndefOr[String] = js.undefined
    
    var normal: String
    
    var pos: PosTag
    
    var tag: Tag
    
    var value: String
  }
  object PosTaggedToken {
    
    inline def apply(normal: String, pos: PosTag, tag: Tag, value: String): PosTaggedToken = {
      val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PosTaggedToken]
    }
    
    extension [Self <: PosTaggedToken](x: Self) {
      
      inline def setLemma(value: String): Self = StObject.set(x, "lemma", value.asInstanceOf[js.Any])
      
      inline def setLemmaUndefined: Self = StObject.set(x, "lemma", js.undefined)
      
      inline def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      inline def setPos(value: PosTag): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.word
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.email
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.emoji
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.punctuation
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.number
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.time
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.hashtag
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.mention
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.emoticon
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.ordinal
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.quoted_phrase
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.url
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.symbol
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.currency
    - typingsJapgolly.winkPosTagger.winkPosTaggerStrings.alien
  */
  trait Tag extends StObject
  object Tag {
    
    inline def alien: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.alien = "alien".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.alien]
    
    inline def currency: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.currency = "currency".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.currency]
    
    inline def email: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.email = "email".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.email]
    
    inline def emoji: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.emoji = "emoji".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.emoji]
    
    inline def emoticon: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.emoticon = "emoticon".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.emoticon]
    
    inline def hashtag: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.hashtag = "hashtag".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.hashtag]
    
    inline def mention: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.mention = "mention".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.mention]
    
    inline def number: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.number = "number".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.number]
    
    inline def ordinal: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.ordinal = "ordinal".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.ordinal]
    
    inline def punctuation: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.punctuation = "punctuation".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.punctuation]
    
    inline def quoted_phrase: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.quoted_phrase = "quoted_phrase".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.quoted_phrase]
    
    inline def symbol: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.symbol = "symbol".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.symbol]
    
    inline def time: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.time = "time".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.time]
    
    inline def url: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.url = "url".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.url]
    
    inline def word: typingsJapgolly.winkPosTagger.winkPosTaggerStrings.word = "word".asInstanceOf[typingsJapgolly.winkPosTagger.winkPosTaggerStrings.word]
  }
  
  trait Tagger extends StObject {
    
    /**
      * This API has no effect. It has been maintained for compatibility purpose.
      * The wink-tokenizer will now always add lemma and normal forms.
      * Note, lemmas are added only for nouns (excluding proper noun), verbs and adjectives.
      * @param config configuration object
      * @returns object with active configuration
      */
    def defineConfig(config: Any): Lemma
    
    /**
      * Tags the input tokens with their pos.
      * In order to pos tag a sentence directly, use tagSentence API instead
      * @param tokens array of tokens, as produced by the wink tokenizer
      * @return pos tagged tokens
      */
    def tag(tokens: js.Array[Token]): js.Array[PosTaggedToken]
    
    /**
      * Tags the raw tokens with their pos.
      * Note, it only categorizes each token in to one of the following 3-categories (a) word, or (b) punctuation, or (c) number.
      * @param tokens to be pos tagged. They are simple array of string.
      * @return pos tagged tokens
      */
    def tagRawTokens(tokens: js.Array[String]): js.Array[PosTaggedToken]
    
    /**
      * Tokenizes the input sentence and tags the tokens.
      * @param sentence to be pos tagged
      * @return pos tagged tokens
      */
    def tagSentence(sentence: String): js.Array[PosTaggedToken]
    
    /**
      * Updates the internal lexicon using the input lexicon.
      * If a word/pos pair is found in the internal lexicon then it's value is updated with the new pos; otherwise it added.
      * @param lexicon object with word/pos pairs to be added or replaced in the existing lexicon.
      * @return pos tagged tokens
      */
    def updateLexicon(lexicon: js.Object): Unit
  }
  object Tagger {
    
    inline def apply(
      defineConfig: Any => Lemma,
      tag: js.Array[Token] => js.Array[PosTaggedToken],
      tagRawTokens: js.Array[String] => js.Array[PosTaggedToken],
      tagSentence: String => js.Array[PosTaggedToken],
      updateLexicon: js.Object => Callback
    ): Tagger = {
      val __obj = js.Dynamic.literal(defineConfig = js.Any.fromFunction1(defineConfig), tag = js.Any.fromFunction1(tag), tagRawTokens = js.Any.fromFunction1(tagRawTokens), tagSentence = js.Any.fromFunction1(tagSentence), updateLexicon = js.Any.fromFunction1((t0: js.Object) => updateLexicon(t0).runNow()))
      __obj.asInstanceOf[Tagger]
    }
    
    extension [Self <: Tagger](x: Self) {
      
      inline def setDefineConfig(value: Any => Lemma): Self = StObject.set(x, "defineConfig", js.Any.fromFunction1(value))
      
      inline def setTag(value: js.Array[Token] => js.Array[PosTaggedToken]): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
      
      inline def setTagRawTokens(value: js.Array[String] => js.Array[PosTaggedToken]): Self = StObject.set(x, "tagRawTokens", js.Any.fromFunction1(value))
      
      inline def setTagSentence(value: String => js.Array[PosTaggedToken]): Self = StObject.set(x, "tagSentence", js.Any.fromFunction1(value))
      
      inline def setUpdateLexicon(value: js.Object => Callback): Self = StObject.set(x, "updateLexicon", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    }
  }
}
