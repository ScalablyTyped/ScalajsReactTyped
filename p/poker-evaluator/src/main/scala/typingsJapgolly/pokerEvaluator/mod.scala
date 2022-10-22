package typingsJapgolly.pokerEvaluator

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("poker-evaluator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("poker-evaluator", "CARDS")
  @js.native
  val CARDS: Deck = js.native
  
  @JSImport("poker-evaluator", "HANDTYPES")
  @js.native
  val HANDTYPES: js.Array[HandName] = js.native
  
  inline def evalHand(cards: js.Array[Double | String]): EvaluatedHand = ^.asInstanceOf[js.Dynamic].applyDynamic("evalHand")(cards.asInstanceOf[js.Any]).asInstanceOf[EvaluatedHand]
  
  @JSImport("poker-evaluator", "ranks")
  @js.native
  val ranks: Buffer = js.native
  
  type Deck = StringDictionary[Double]
  
  trait EvaluatedHand extends StObject {
    
    var handName: HandName
    
    // Index of HANDTYPES array
    var handRank: Double
    
    var handType: Double
    
    var value: Double
  }
  object EvaluatedHand {
    
    inline def apply(handName: HandName, handRank: Double, handType: Double, value: Double): EvaluatedHand = {
      val __obj = js.Dynamic.literal(handName = handName.asInstanceOf[js.Any], handRank = handRank.asInstanceOf[js.Any], handType = handType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EvaluatedHand]
    }
    
    extension [Self <: EvaluatedHand](x: Self) {
      
      inline def setHandName(value: HandName): Self = StObject.set(x, "handName", value.asInstanceOf[js.Any])
      
      inline def setHandRank(value: Double): Self = StObject.set(x, "handRank", value.asInstanceOf[js.Any])
      
      inline def setHandType(value: Double): Self = StObject.set(x, "handType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`invalid hand`
    - typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`high card`
    - typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`one pair`
    - typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`two pairs`
    - typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`three of a kind`
    - typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.straight
    - typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.flush
    - typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`full house`
    - typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`four of a kind`
    - typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`straight flush`
  */
  trait HandName extends StObject
  object HandName {
    
    inline def flush: typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.flush = "flush".asInstanceOf[typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.flush]
    
    inline def `four of a kind`: typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`four of a kind` = ("four of a kind").asInstanceOf[typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`four of a kind`]
    
    inline def `full house`: typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`full house` = ("full house").asInstanceOf[typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`full house`]
    
    inline def `high card`: typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`high card` = ("high card").asInstanceOf[typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`high card`]
    
    inline def `invalid hand`: typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`invalid hand` = ("invalid hand").asInstanceOf[typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`invalid hand`]
    
    inline def `one pair`: typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`one pair` = ("one pair").asInstanceOf[typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`one pair`]
    
    inline def straight: typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.straight = "straight".asInstanceOf[typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.straight]
    
    inline def `straight flush`: typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`straight flush` = ("straight flush").asInstanceOf[typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`straight flush`]
    
    inline def `three of a kind`: typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`three of a kind` = ("three of a kind").asInstanceOf[typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`three of a kind`]
    
    inline def `two pairs`: typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`two pairs` = ("two pairs").asInstanceOf[typingsJapgolly.pokerEvaluator.pokerEvaluatorStrings.`two pairs`]
  }
}
