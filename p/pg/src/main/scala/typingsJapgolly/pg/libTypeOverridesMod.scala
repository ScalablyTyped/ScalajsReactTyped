package typingsJapgolly.pg

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.pg.anon.FnCall
import typingsJapgolly.pg.mod.CustomTypesConfig
import typingsJapgolly.pg.pgStrings.binary
import typingsJapgolly.pg.pgStrings.text
import typingsJapgolly.pgTypes.mod.TypeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypeOverridesMod {
  
  @JSImport("pg/lib/type-overrides", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TypeOverrides {
    def this(types: CustomTypesConfig) = this()
    
    /* CompleteClass */
    override def getTypeParser[T](oid: Double): typingsJapgolly.pgTypes.mod.TypeParser[String, T | String] = js.native
    /* CompleteClass */
    override def getTypeParser[T](oid: TypeId): typingsJapgolly.pgTypes.mod.TypeParser[String, T | String] = js.native
    /* CompleteClass */
    @JSName("getTypeParser")
    var getTypeParser_Original: FnCall = js.native
    /* CompleteClass */
    @JSName("getTypeParser")
    override def getTypeParser_binary[T](oid: Double, format: binary): typingsJapgolly.pgTypes.mod.TypeParser[Buffer, T | String] = js.native
    /* CompleteClass */
    @JSName("getTypeParser")
    override def getTypeParser_binary[T](oid: TypeId, format: binary): typingsJapgolly.pgTypes.mod.TypeParser[Buffer, T | String] = js.native
    /* CompleteClass */
    @JSName("getTypeParser")
    override def getTypeParser_text[T](oid: Double, format: text): typingsJapgolly.pgTypes.mod.TypeParser[String, T | String] = js.native
    /* CompleteClass */
    @JSName("getTypeParser")
    override def getTypeParser_text[T](oid: TypeId, format: text): typingsJapgolly.pgTypes.mod.TypeParser[String, T | String] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pg.pgStrings.text
    - typingsJapgolly.pg.pgStrings.binary
  */
  trait TypeFormat extends StObject
  object TypeFormat {
    
    inline def binary: typingsJapgolly.pg.pgStrings.binary = "binary".asInstanceOf[typingsJapgolly.pg.pgStrings.binary]
    
    inline def text: typingsJapgolly.pg.pgStrings.text = "text".asInstanceOf[typingsJapgolly.pg.pgStrings.text]
  }
  
  @js.native
  trait TypeOverrides
    extends StObject
       with CustomTypesConfig {
    
    def getTypeParser(oid: Double, format: TypeFormat): TypeParser[Double, Any] = js.native
    
    def setTypeParser(oid: Double, fn: TypeParser[Double, Any]): Unit = js.native
    def setTypeParser(oid: Double, format: TypeFormat, fn: TypeParser[Double, Any]): Unit = js.native
  }
  
  type TypeParser[TOid, TReturn] = js.Function1[/* oid */ TOid, TReturn]
}
