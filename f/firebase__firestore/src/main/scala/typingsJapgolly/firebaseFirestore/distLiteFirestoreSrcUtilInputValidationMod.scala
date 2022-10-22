package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.anon.Instantiable
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcUtilInputValidationMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/util/input_validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cast[T](obj: js.Object, constructor: Instantiable[T]): T | scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(obj.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T | scala.Nothing]
  
  inline def isPlainObject(input: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tryGetCustomObjectType(input: js.Object): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("tryGetCustomObjectType")(input.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def validateCollectionPath(path: ResourcePath): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCollectionPath")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateDocumentPath(path: ResourcePath): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateDocumentPath")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Boolean, optionName2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Boolean, optionName2: String, argument2: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any], argument2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Unit, optionName2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Unit, optionName2: String, argument2: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any], argument2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateNonEmptyArgument(functionName: String, argumentName: String): /* asserts argument is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNonEmptyArgument")(functionName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any])).asInstanceOf[/* asserts argument is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean]
  inline def validateNonEmptyArgument(functionName: String, argumentName: String, argument: String): /* asserts argument is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNonEmptyArgument")(functionName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], argument.asInstanceOf[js.Any])).asInstanceOf[/* asserts argument is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean]
  
  inline def validatePositiveNumber(functionName: String, n: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePositiveNumber")(functionName.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def valueDescription(input: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("valueDescription")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.undefined
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`object`
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.function
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.boolean
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.number
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.string
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`non-empty string`
  */
  trait ValidationType extends StObject
  object ValidationType {
    
    inline def boolean: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.boolean = "boolean".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.boolean]
    
    inline def function: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.function = "function".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.function]
    
    inline def `non-empty string`: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`non-empty string` = ("non-empty string").asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`non-empty string`]
    
    inline def number: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.number = "number".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.number]
    
    inline def `object`: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`object` = "object".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`object`]
    
    inline def string: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.string = "string".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.string]
    
    inline def undefined: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.undefined = "undefined".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.undefined]
  }
}
