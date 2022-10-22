package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a struct type, supporting polymorphic struct types.
  *
  * This type supersedes {@link XCompoundTypeDescription} , which only supports plain struct types.
  *
  * This type is used to reflect all of the following:
  *
  * Polymorphic struct type templates, like `Struct<T, U>` . For these, {@link com.sun.star.reflection.XStructTypeDescription.getTypeParameters()} returns
  * a non-empty sequence, while {@link com.sun.star.reflection.XStructTypeDescription.getTypeArguments()} returns an empty sequence.
  *
  * Instantiated polymorphic struct types, like `Struct<long, hyper>` . For these, {@link
  * com.sun.star.reflection.XStructTypeDescription.getTypeParameters()} returns an empty sequence, while {@link
  * com.sun.star.reflection.XStructTypeDescription.getTypeArguments()} returns a non-empty sequence.
  *
  * Plain struct types. For these, both {@link com.sun.star.reflection.XStructTypeDescription.getTypeParameters()} and {@link
  * com.sun.star.reflection.XStructTypeDescription.getTypeArguments()} return an empty sequence.
  * @since OOo 2.0
  */
trait XStructTypeDescription
  extends StObject
     with XCompoundTypeDescription {
  
  /**
    * Returns the type arguments of an instantiated polymorphic struct type.
    * @returns a sequence of all type arguments, in the correct order; for a plain struct type, or a polymorphic struct type template, an empty sequence is returned
    */
  val TypeArguments: SafeArray[XTypeDescription]
  
  /**
    * Returns the type parameters of a polymorphic struct type template.
    * @returns a sequence of the names of all type parameters, in the correct order; for a plain struct type, or an instantiated polymorphic struct type, an emp
    */
  val TypeParameters: SafeArray[String]
  
  /**
    * Returns the type arguments of an instantiated polymorphic struct type.
    * @returns a sequence of all type arguments, in the correct order; for a plain struct type, or a polymorphic struct type template, an empty sequence is returned
    */
  def getTypeArguments(): SafeArray[XTypeDescription]
  
  /**
    * Returns the type parameters of a polymorphic struct type template.
    * @returns a sequence of the names of all type parameters, in the correct order; for a plain struct type, or an instantiated polymorphic struct type, an emp
    */
  def getTypeParameters(): SafeArray[String]
}
object XStructTypeDescription {
  
  inline def apply(
    BaseType: XTypeDescription,
    MemberNames: SafeArray[String],
    MemberTypes: SafeArray[XTypeDescription],
    Name: String,
    TypeArguments: SafeArray[XTypeDescription],
    TypeClass: TypeClass,
    TypeParameters: SafeArray[String],
    acquire: Callback,
    getBaseType: CallbackTo[XTypeDescription],
    getMemberNames: CallbackTo[SafeArray[String]],
    getMemberTypes: CallbackTo[SafeArray[XTypeDescription]],
    getName: CallbackTo[String],
    getTypeArguments: CallbackTo[SafeArray[XTypeDescription]],
    getTypeClass: CallbackTo[TypeClass],
    getTypeParameters: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback
  ): XStructTypeDescription = {
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], MemberNames = MemberNames.asInstanceOf[js.Any], MemberTypes = MemberTypes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeArguments = TypeArguments.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], TypeParameters = TypeParameters.asInstanceOf[js.Any], acquire = acquire.toJsFn, getBaseType = getBaseType.toJsFn, getMemberNames = getMemberNames.toJsFn, getMemberTypes = getMemberTypes.toJsFn, getName = getName.toJsFn, getTypeArguments = getTypeArguments.toJsFn, getTypeClass = getTypeClass.toJsFn, getTypeParameters = getTypeParameters.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStructTypeDescription]
  }
  
  extension [Self <: XStructTypeDescription](x: Self) {
    
    inline def setGetTypeArguments(value: CallbackTo[SafeArray[XTypeDescription]]): Self = StObject.set(x, "getTypeArguments", value.toJsFn)
    
    inline def setGetTypeParameters(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getTypeParameters", value.toJsFn)
    
    inline def setTypeArguments(value: SafeArray[XTypeDescription]): Self = StObject.set(x, "TypeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: SafeArray[String]): Self = StObject.set(x, "TypeParameters", value.asInstanceOf[js.Any])
  }
}
