package typingsJapgolly.rdflib

import typingsJapgolly.rdflib.anon.Boolean
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod.DataFactory
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod.DefaultFactoryTypes
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod.Indexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libXsdMod {
  
  @JSImport("rdflib/lib/xsd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("rdflib/lib/xsd", "default.boolean")
    @js.native
    val boolean: typingsJapgolly.rdflib.libNamedNodeMod.default = js.native
    
    @JSImport("rdflib/lib/xsd", "default.dateTime")
    @js.native
    val dateTime: typingsJapgolly.rdflib.libNamedNodeMod.default = js.native
    
    @JSImport("rdflib/lib/xsd", "default.decimal")
    @js.native
    val decimal: typingsJapgolly.rdflib.libNamedNodeMod.default = js.native
    
    @JSImport("rdflib/lib/xsd", "default.double")
    @js.native
    val double: typingsJapgolly.rdflib.libNamedNodeMod.default = js.native
    
    @JSImport("rdflib/lib/xsd", "default.integer")
    @js.native
    val integer: typingsJapgolly.rdflib.libNamedNodeMod.default = js.native
    
    @JSImport("rdflib/lib/xsd", "default.langString")
    @js.native
    val langString: typingsJapgolly.rdflib.libNamedNodeMod.default = js.native
    
    @JSImport("rdflib/lib/xsd", "default.string")
    @js.native
    val string: typingsJapgolly.rdflib.libNamedNodeMod.default = js.native
  }
  
  inline def createXSD(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("createXSD")().asInstanceOf[Boolean]
  inline def createXSD(localFactory: DataFactory[DefaultFactoryTypes, Indexable]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("createXSD")(localFactory.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
