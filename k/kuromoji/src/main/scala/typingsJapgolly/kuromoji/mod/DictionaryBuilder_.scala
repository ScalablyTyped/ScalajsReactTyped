package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.doublearray.doublearray.DoubleArray
import typingsJapgolly.kuromoji.anon.Tokeninfodictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictionaryBuilder_ extends StObject {
  
  def addTokenInfoDictionary(text: String): DictionaryBuilder_
  
  def build(): DynamicDictionaries
  
  def buildConnectionCosts(): ConnectionCosts
  
  def buildDoubleArray(): DoubleArray
  
  def buildTokenInfoDictionary(): Tokeninfodictionary
  
  def buildUnknownDictionary(): UnknownDictionary
  
  def charDef(char_text: String): DictionaryBuilder_
  
  def costMatrix(matrix_text: String): DictionaryBuilder_
  
  var tid_entries: js.Array[String]
  
  def unkDef(text: String): DictionaryBuilder_
  
  var unk_entries: js.Array[String]
}
object DictionaryBuilder_ {
  
  inline def apply(
    addTokenInfoDictionary: String => DictionaryBuilder_,
    build: CallbackTo[DynamicDictionaries],
    buildConnectionCosts: CallbackTo[ConnectionCosts],
    buildDoubleArray: CallbackTo[DoubleArray],
    buildTokenInfoDictionary: CallbackTo[Tokeninfodictionary],
    buildUnknownDictionary: CallbackTo[UnknownDictionary],
    charDef: String => DictionaryBuilder_,
    costMatrix: String => DictionaryBuilder_,
    tid_entries: js.Array[String],
    unkDef: String => DictionaryBuilder_,
    unk_entries: js.Array[String]
  ): DictionaryBuilder_ = {
    val __obj = js.Dynamic.literal(addTokenInfoDictionary = js.Any.fromFunction1(addTokenInfoDictionary), build = build.toJsFn, buildConnectionCosts = buildConnectionCosts.toJsFn, buildDoubleArray = buildDoubleArray.toJsFn, buildTokenInfoDictionary = buildTokenInfoDictionary.toJsFn, buildUnknownDictionary = buildUnknownDictionary.toJsFn, charDef = js.Any.fromFunction1(charDef), costMatrix = js.Any.fromFunction1(costMatrix), tid_entries = tid_entries.asInstanceOf[js.Any], unkDef = js.Any.fromFunction1(unkDef), unk_entries = unk_entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryBuilder_]
  }
  
  extension [Self <: DictionaryBuilder_](x: Self) {
    
    inline def setAddTokenInfoDictionary(value: String => DictionaryBuilder_): Self = StObject.set(x, "addTokenInfoDictionary", js.Any.fromFunction1(value))
    
    inline def setBuild(value: CallbackTo[DynamicDictionaries]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setBuildConnectionCosts(value: CallbackTo[ConnectionCosts]): Self = StObject.set(x, "buildConnectionCosts", value.toJsFn)
    
    inline def setBuildDoubleArray(value: CallbackTo[DoubleArray]): Self = StObject.set(x, "buildDoubleArray", value.toJsFn)
    
    inline def setBuildTokenInfoDictionary(value: CallbackTo[Tokeninfodictionary]): Self = StObject.set(x, "buildTokenInfoDictionary", value.toJsFn)
    
    inline def setBuildUnknownDictionary(value: CallbackTo[UnknownDictionary]): Self = StObject.set(x, "buildUnknownDictionary", value.toJsFn)
    
    inline def setCharDef(value: String => DictionaryBuilder_): Self = StObject.set(x, "charDef", js.Any.fromFunction1(value))
    
    inline def setCostMatrix(value: String => DictionaryBuilder_): Self = StObject.set(x, "costMatrix", js.Any.fromFunction1(value))
    
    inline def setTid_entries(value: js.Array[String]): Self = StObject.set(x, "tid_entries", value.asInstanceOf[js.Any])
    
    inline def setTid_entriesVarargs(value: String*): Self = StObject.set(x, "tid_entries", js.Array(value*))
    
    inline def setUnkDef(value: String => DictionaryBuilder_): Self = StObject.set(x, "unkDef", js.Any.fromFunction1(value))
    
    inline def setUnk_entries(value: js.Array[String]): Self = StObject.set(x, "unk_entries", value.asInstanceOf[js.Any])
    
    inline def setUnk_entriesVarargs(value: String*): Self = StObject.set(x, "unk_entries", js.Array(value*))
  }
}
