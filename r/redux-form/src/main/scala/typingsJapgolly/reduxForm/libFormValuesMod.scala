package typingsJapgolly.reduxForm

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reduxForm.reduxFormStrings.append
import typingsJapgolly.reduxForm.reduxFormStrings.delete
import typingsJapgolly.reduxForm.reduxFormStrings.entries
import typingsJapgolly.reduxForm.reduxFormStrings.forEach
import typingsJapgolly.reduxForm.reduxFormStrings.get
import typingsJapgolly.reduxForm.reduxFormStrings.getAll
import typingsJapgolly.reduxForm.reduxFormStrings.has
import typingsJapgolly.reduxForm.reduxFormStrings.keys
import typingsJapgolly.reduxForm.reduxFormStrings.set
import typingsJapgolly.reduxForm.reduxFormStrings.values
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormValuesMod {
  
  @JSImport("redux-form/lib/formValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formValues[Values, P](obj: Values): js.Function1[
    /* component */ ComponentType[
      P & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Values ]: any} */ js.Any)
    ], 
    ComponentClassP[
      P & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Values ]: any} */ js.Any) & js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("formValues")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[
      P & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Values ]: any} */ js.Any)
    ], 
    ComponentClassP[
      P & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Values ]: any} */ js.Any) & js.Object
    ]
  ]]
  inline def formValues[FormData, K /* <: /* keyof FormData */ append | delete | get | getAll | has | set | forEach | entries | keys | values */, P](names: K*): js.Function1[
    /* component */ ComponentType[P & (Pick[FormData, K])], 
    ComponentClassP[P & (Pick[FormData, K]) & js.Object]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("formValues")(names.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[
    /* component */ ComponentType[P & (Pick[FormData, K])], 
    ComponentClassP[P & (Pick[FormData, K]) & js.Object]
  ]]
}
