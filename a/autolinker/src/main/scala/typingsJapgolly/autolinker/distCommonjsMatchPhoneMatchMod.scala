package typingsJapgolly.autolinker

import typingsJapgolly.autolinker.autolinkerStrings.phone
import typingsJapgolly.autolinker.distCommonjsAnchorTagBuilderMod.AnchorTagBuilder
import typingsJapgolly.autolinker.distCommonjsMatchAbstractMatchMod.AbstractMatch
import typingsJapgolly.autolinker.distCommonjsMatchAbstractMatchMod.AbstractMatchConfig
import typingsJapgolly.autolinker.distCommonjsMatchMatchMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsMatchPhoneMatchMod {
  
  @JSImport("autolinker/dist/commonjs/match/phone-match", "PhoneMatch")
  @js.native
  open class PhoneMatch protected ()
    extends AbstractMatch
       with Match {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: PhoneMatchConfig) = this()
    
    /**
      * Alias of {@link #getPhoneNumber}, returns the phone number that was
      * matched as a string, without any delimiter characters.
      *
      * Note: This is a string to allow for prefixed 0's.
      *
      * @return {String}
      */
    def getNumber(): String = js.native
    
    /**
      * Returns the phone number that was matched as a string, without any
      * delimiter characters.
      *
      * Note: This is a string to allow for prefixed 0's.
      *
      * @return {String}
      */
    def getPhoneNumber(): String = js.native
    
    /**
      * @protected
      * @property {String} number (required)
      *
      * The phone number that was matched, without any delimiter characters.
      *
      * Note: This is a string to allow for prefixed 0's.
      */
    /* private */ val number: Any = js.native
    
    /**
      * @protected
      * @property  {Boolean} plusSign (required)
      *
      * `true` if the matched phone number started with a '+' sign. We'll include
      * it in the `tel:` URL if so, as this is needed for international numbers.
      *
      * Ex: '+1 (123) 456 7879'
      */
    /* private */ val plusSign: Any = js.native
    
    /**
      * @public
      * @property {'phone'} type
      *
      * A string name for the type of match that this class represents. Can be
      * used in a TypeScript discriminating union to type-narrow from the
      * `Match` type.
      */
    @JSName("type")
    val type_PhoneMatch: phone = js.native
  }
  
  trait PhoneMatchConfig
    extends StObject
       with AbstractMatchConfig {
    
    var number: String
    
    var plusSign: Boolean
  }
  object PhoneMatchConfig {
    
    inline def apply(
      matchedText: String,
      number: String,
      offset: Double,
      plusSign: Boolean,
      tagBuilder: AnchorTagBuilder
    ): PhoneMatchConfig = {
      val __obj = js.Dynamic.literal(matchedText = matchedText.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], plusSign = plusSign.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneMatchConfig]
    }
    
    extension [Self <: PhoneMatchConfig](x: Self) {
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPlusSign(value: Boolean): Self = StObject.set(x, "plusSign", value.asInstanceOf[js.Any])
    }
  }
}
