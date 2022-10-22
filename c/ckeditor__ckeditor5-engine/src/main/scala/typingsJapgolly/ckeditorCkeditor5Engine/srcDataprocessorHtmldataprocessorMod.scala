package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DOMParser
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.marked
import typingsJapgolly.ckeditorCkeditor5Engine.srcDataprocessorDataprocessorMod.DataProcessor
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewMatcherMod.MatcherPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDataprocessorHtmldataprocessorMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/dataprocessor/htmldataprocessor", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with HtmlDataProcessor {
    /**
      * Creates a new instance of the HTML data processor class.
      */
    def this(document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default) = this()
    
    /**
      * A DOM converter used to convert DOM elements to view elements.
      */
    /* CompleteClass */
    var domConverter: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default = js.native
    
    /**
      * A DOM parser instance used to parse an HTML string to an HTML document.
      */
    /* CompleteClass */
    override val domParser: DOMParser = js.native
    
    /**
      * A basic HTML writer instance used to convert DOM elements to an HTML string.
      */
    /* CompleteClass */
    override val htmlWriter: typingsJapgolly.ckeditorCkeditor5Engine.srcDataprocessorBasichtmlwriterMod.default = js.native
    
    /* CompleteClass */
    override def registerRawContentMatcher(pattern: MatcherPattern): Unit = js.native
    
    /* CompleteClass */
    override def toData(fragment: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default): String = js.native
    
    /* CompleteClass */
    override def toView(data: String): typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null = js.native
    
    /* CompleteClass */
    override def useFillerType(`type`: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked): Unit = js.native
  }
  
  trait HtmlDataProcessor
    extends StObject
       with DataProcessor {
    
    /**
      * A DOM converter used to convert DOM elements to view elements.
      */
    var domConverter: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default
    
    /**
      * A DOM parser instance used to parse an HTML string to an HTML document.
      */
    val domParser: DOMParser
    
    /**
      * A basic HTML writer instance used to convert DOM elements to an HTML string.
      */
    val htmlWriter: typingsJapgolly.ckeditorCkeditor5Engine.srcDataprocessorBasichtmlwriterMod.default
  }
  object HtmlDataProcessor {
    
    inline def apply(
      domConverter: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default,
      domParser: DOMParser,
      htmlWriter: typingsJapgolly.ckeditorCkeditor5Engine.srcDataprocessorBasichtmlwriterMod.default,
      registerRawContentMatcher: MatcherPattern => Callback,
      toData: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default => String,
      toView: String => typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null,
      useFillerType: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked => Callback
    ): HtmlDataProcessor = {
      val __obj = js.Dynamic.literal(domConverter = domConverter.asInstanceOf[js.Any], domParser = domParser.asInstanceOf[js.Any], htmlWriter = htmlWriter.asInstanceOf[js.Any], registerRawContentMatcher = js.Any.fromFunction1((t0: MatcherPattern) => registerRawContentMatcher(t0).runNow()), toData = js.Any.fromFunction1(toData), toView = js.Any.fromFunction1(toView), useFillerType = js.Any.fromFunction1((t0: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked) => useFillerType(t0).runNow()))
      __obj.asInstanceOf[HtmlDataProcessor]
    }
    
    extension [Self <: HtmlDataProcessor](x: Self) {
      
      inline def setDomConverter(value: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default): Self = StObject.set(x, "domConverter", value.asInstanceOf[js.Any])
      
      inline def setDomParser(value: DOMParser): Self = StObject.set(x, "domParser", value.asInstanceOf[js.Any])
      
      inline def setHtmlWriter(value: typingsJapgolly.ckeditorCkeditor5Engine.srcDataprocessorBasichtmlwriterMod.default): Self = StObject.set(x, "htmlWriter", value.asInstanceOf[js.Any])
    }
  }
}
