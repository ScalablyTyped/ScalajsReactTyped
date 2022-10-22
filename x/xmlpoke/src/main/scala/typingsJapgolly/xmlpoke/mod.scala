package typingsJapgolly.xmlpoke

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.xmlpoke.XmlPoke.API
import typingsJapgolly.xmlpoke.XmlPoke.XmlValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(xml: String, modify: js.Function1[/* api */ API, Unit]): String = (^.asInstanceOf[js.Dynamic].apply(xml.asInstanceOf[js.Any], modify.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("xmlpoke", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("xmlpoke", "CDataValue")
  @js.native
  open class CDataValue protected ()
    extends StObject
       with typingsJapgolly.xmlpoke.XmlPoke.CDataValue {
    def this(value: String) = this()
    
    /* CompleteClass */
    var value: String = js.native
  }
  @JSImport("xmlpoke", "CDataValue")
  @js.native
  def CDataValue: Instantiable1[/* value */ String, typingsJapgolly.xmlpoke.XmlPoke.CDataValue] = js.native
  inline def CDataValue_=(x: Instantiable1[/* value */ String, typingsJapgolly.xmlpoke.XmlPoke.CDataValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CDataValue")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("xmlpoke", "XmlString")
  @js.native
  open class XmlString protected ()
    extends StObject
       with XmlValue {
    def this(value: String) = this()
    
    /* CompleteClass */
    var value: String = js.native
  }
  @JSImport("xmlpoke", "XmlString")
  @js.native
  def XmlString: Instantiable1[/* value */ String, XmlValue] = js.native
  inline def XmlString_=(x: Instantiable1[/* value */ String, XmlValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XmlString")(x.asInstanceOf[js.Any])
}
