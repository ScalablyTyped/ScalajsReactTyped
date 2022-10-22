package typingsJapgolly.testingLibraryTestcafe

import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.ReturnType
import typingsJapgolly.testcafe.mod.global.SelectorPromise
import typingsJapgolly.testingLibraryDom.typesGetQueriesForElementMod.BoundFunction
import typingsJapgolly.testingLibraryDom.typesQueriesMod.AllByBoundAttribute
import typingsJapgolly.testingLibraryDom.typesQueriesMod.AllByRole
import typingsJapgolly.testingLibraryDom.typesQueriesMod.AllByText
import typingsJapgolly.testingLibraryDom.typesQueriesMod.FindAllByBoundAttribute
import typingsJapgolly.testingLibraryDom.typesQueriesMod.FindAllByRole_
import typingsJapgolly.testingLibraryDom.typesQueriesMod.FindAllByText_
import typingsJapgolly.testingLibraryDom.typesQueriesMod.FindByBoundAttribute
import typingsJapgolly.testingLibraryDom.typesQueriesMod.FindByRole_
import typingsJapgolly.testingLibraryDom.typesQueriesMod.FindByText_
import typingsJapgolly.testingLibraryDom.typesQueriesMod.GetByBoundAttribute
import typingsJapgolly.testingLibraryDom.typesQueriesMod.GetByRole_
import typingsJapgolly.testingLibraryDom.typesQueriesMod.GetByText_
import typingsJapgolly.testingLibraryDom.typesQueriesMod.QueryByBoundAttribute
import typingsJapgolly.testingLibraryDom.typesQueriesMod.QueryByRole_
import typingsJapgolly.testingLibraryDom.typesQueriesMod.QueryByText_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  /* Inlined std.Pick<@testing-library/dom.@testing-library/dom.Config, 'testIdAttribute'> */
  trait Options extends StObject {
    
    var testIdAttribute: String
  }
  object Options {
    
    inline def apply(testIdAttribute: String): Options = {
      val __obj = js.Dynamic.literal(testIdAttribute = testIdAttribute.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setTestIdAttribute(value: String): Self = StObject.set(x, "testIdAttribute", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof @testing-library/testcafe.anon.Typeofqueries */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getAllByPlaceholderText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getByPlaceholderText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findAllByPlaceholderText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryByPlaceholderText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryAllByDisplayValue
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryAllByLabelText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findByText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryByLabelText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getAllByDisplayValue
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryByText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findByDisplayValue
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getAllByRole
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryAllByTestId
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryAllByPlaceholderText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getAllByTestId
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findByPlaceholderText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryAllByAltText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryByTitle
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findAllByText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findAllByDisplayValue
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryAllByText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getAllByText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getByTitle
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getAllByTitle
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findByAltText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findByTitle
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findByTestId
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getByLabelText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryAllByTitle
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryByAltText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getByRole
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryByTestId
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryByRole
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryAllByRole
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findByLabelText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getAllByLabelText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getByDisplayValue
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findAllByLabelText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findAllByTestId
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getAllByAltText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findAllByRole
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findAllByAltText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findAllByTitle
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getByTestId
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.findByRole
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getByText
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.queryByDisplayValue
    - typingsJapgolly.testingLibraryTestcafe.testingLibraryTestcafeStrings.getByAltText
  */
  trait QueryName extends StObject
  
  type TestcafeBoundFunction[T] = js.Function1[/* params */ Parameters[BoundFunction[T]], SelectorPromise]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: @testing-library/testcafe.@testing-library/testcafe/dist/types.TestcafeBoundFunction<T[P]>}
    }}}
    */
  @js.native
  trait TestcafeBoundFunctions[T] extends StObject
  
  /* Inlined @testing-library/testcafe.@testing-library/testcafe/dist/types.TestcafeBoundFunctions<{readonly getAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly getByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly findAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly queryByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly queryAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly findByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>, readonly queryByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>, readonly getAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByText<T>>, readonly findByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly getAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>, readonly queryAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryAllByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly getAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findByPlaceholderText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly queryAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly findAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>, readonly findAllByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly queryAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly getAllByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly getByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly getAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly findByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly findByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute<T>>, readonly getByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>, readonly queryAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly queryByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly getByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByRole<T>>, readonly queryByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly queryByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByRole<T>>, readonly queryAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByRole<T>>, readonly findByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByText<T>>, readonly getAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByText<T>>, readonly getByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly findAllByLabelText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByText<T>>, readonly findAllByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly getAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute<T>>, readonly findAllByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole<T>>, readonly findAllByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly findAllByTitle <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute<T>>, readonly getByTestId <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>, readonly findByRole <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.FindByRole<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.FindByRole<T>>, readonly getByText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByText<T>>, readonly queryByDisplayValue <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute<T>>, readonly getByAltText <T extends std.HTMLElement = std.HTMLElement>(args : std.Parameters<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>): std.ReturnType<@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute<T>>}> */
  trait WithinSelectors extends StObject {
    
    def findAllByAltText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
              ReturnType[FindAllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findAllByAltText")
    var findAllByAltText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
          ReturnType[FindAllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def findAllByDisplayValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
              ReturnType[FindAllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findAllByDisplayValue")
    var findAllByDisplayValue_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
          ReturnType[FindAllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def findAllByLabelText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindAllByText_[HTMLElement]], 
              ReturnType[FindAllByText_[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findAllByLabelText")
    var findAllByLabelText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByText_[HTMLElement]], 
          ReturnType[FindAllByText_[HTMLElement]]
        ]
      ]
    
    def findAllByPlaceholderText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
              ReturnType[FindAllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findAllByPlaceholderText")
    var findAllByPlaceholderText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
          ReturnType[FindAllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def findAllByRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindAllByRole_[HTMLElement]], 
              ReturnType[FindAllByRole_[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findAllByRole")
    var findAllByRole_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByRole_[HTMLElement]], 
          ReturnType[FindAllByRole_[HTMLElement]]
        ]
      ]
    
    def findAllByTestId(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
              ReturnType[FindAllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findAllByTestId")
    var findAllByTestId_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
          ReturnType[FindAllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def findAllByText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindAllByText_[HTMLElement]], 
              ReturnType[FindAllByText_[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findAllByText")
    var findAllByText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByText_[HTMLElement]], 
          ReturnType[FindAllByText_[HTMLElement]]
        ]
      ]
    
    def findAllByTitle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
              ReturnType[FindAllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findAllByTitle")
    var findAllByTitle_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
          ReturnType[FindAllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def findByAltText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
              ReturnType[FindByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findByAltText")
    var findByAltText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
          ReturnType[FindByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def findByDisplayValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
              ReturnType[FindByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findByDisplayValue")
    var findByDisplayValue_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
          ReturnType[FindByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def findByLabelText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindByText_[HTMLElement]], 
              ReturnType[FindByText_[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findByLabelText")
    var findByLabelText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindByText_[HTMLElement]], 
          ReturnType[FindByText_[HTMLElement]]
        ]
      ]
    
    def findByPlaceholderText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
              ReturnType[FindByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findByPlaceholderText")
    var findByPlaceholderText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
          ReturnType[FindByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def findByRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindByRole_[HTMLElement]], 
              ReturnType[FindByRole_[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findByRole")
    var findByRole_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindByRole_[HTMLElement]], 
          ReturnType[FindByRole_[HTMLElement]]
        ]
      ]
    
    def findByTestId(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
              ReturnType[FindByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findByTestId")
    var findByTestId_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
          ReturnType[FindByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def findByText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindByText_[HTMLElement]], 
              ReturnType[FindByText_[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findByText")
    var findByText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindByText_[HTMLElement]], 
          ReturnType[FindByText_[HTMLElement]]
        ]
      ]
    
    def findByTitle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
              ReturnType[FindByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("findByTitle")
    var findByTitle_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
          ReturnType[FindByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def getAllByAltText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
              ReturnType[AllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getAllByAltText")
    var getAllByAltText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def getAllByDisplayValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
              ReturnType[AllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getAllByDisplayValue")
    var getAllByDisplayValue_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def getAllByLabelText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
          ]
        ]
    ): SelectorPromise
    @JSName("getAllByLabelText")
    var getAllByLabelText_Original: TestcafeBoundFunction[
        js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
      ]
    
    def getAllByPlaceholderText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
              ReturnType[AllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getAllByPlaceholderText")
    var getAllByPlaceholderText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def getAllByRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[/* args */ Parameters[AllByRole[HTMLElement]], ReturnType[AllByRole[HTMLElement]]]
          ]
        ]
    ): SelectorPromise
    @JSName("getAllByRole")
    var getAllByRole_Original: TestcafeBoundFunction[
        js.Function1[/* args */ Parameters[AllByRole[HTMLElement]], ReturnType[AllByRole[HTMLElement]]]
      ]
    
    def getAllByTestId(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
              ReturnType[AllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getAllByTestId")
    var getAllByTestId_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def getAllByText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
          ]
        ]
    ): SelectorPromise
    @JSName("getAllByText")
    var getAllByText_Original: TestcafeBoundFunction[
        js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
      ]
    
    def getAllByTitle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
              ReturnType[AllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getAllByTitle")
    var getAllByTitle_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def getByAltText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
              ReturnType[GetByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getByAltText")
    var getByAltText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
          ReturnType[GetByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def getByDisplayValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
              ReturnType[GetByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getByDisplayValue")
    var getByDisplayValue_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
          ReturnType[GetByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def getByLabelText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[GetByText_[HTMLElement]], 
              ReturnType[GetByText_[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getByLabelText")
    var getByLabelText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[GetByText_[HTMLElement]], 
          ReturnType[GetByText_[HTMLElement]]
        ]
      ]
    
    def getByPlaceholderText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
              ReturnType[GetByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getByPlaceholderText")
    var getByPlaceholderText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
          ReturnType[GetByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def getByRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[GetByRole_[HTMLElement]], 
              ReturnType[GetByRole_[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getByRole")
    var getByRole_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[GetByRole_[HTMLElement]], 
          ReturnType[GetByRole_[HTMLElement]]
        ]
      ]
    
    def getByTestId(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
              ReturnType[GetByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getByTestId")
    var getByTestId_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
          ReturnType[GetByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def getByText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[GetByText_[HTMLElement]], 
              ReturnType[GetByText_[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getByText")
    var getByText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[GetByText_[HTMLElement]], 
          ReturnType[GetByText_[HTMLElement]]
        ]
      ]
    
    def getByTitle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
              ReturnType[GetByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("getByTitle")
    var getByTitle_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
          ReturnType[GetByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def queryAllByAltText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
              ReturnType[AllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryAllByAltText")
    var queryAllByAltText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def queryAllByDisplayValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
              ReturnType[AllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryAllByDisplayValue")
    var queryAllByDisplayValue_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def queryAllByLabelText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
          ]
        ]
    ): SelectorPromise
    @JSName("queryAllByLabelText")
    var queryAllByLabelText_Original: TestcafeBoundFunction[
        js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
      ]
    
    def queryAllByPlaceholderText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
              ReturnType[AllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryAllByPlaceholderText")
    var queryAllByPlaceholderText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def queryAllByRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[/* args */ Parameters[AllByRole[HTMLElement]], ReturnType[AllByRole[HTMLElement]]]
          ]
        ]
    ): SelectorPromise
    @JSName("queryAllByRole")
    var queryAllByRole_Original: TestcafeBoundFunction[
        js.Function1[/* args */ Parameters[AllByRole[HTMLElement]], ReturnType[AllByRole[HTMLElement]]]
      ]
    
    def queryAllByTestId(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
              ReturnType[AllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryAllByTestId")
    var queryAllByTestId_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def queryAllByText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
          ]
        ]
    ): SelectorPromise
    @JSName("queryAllByText")
    var queryAllByText_Original: TestcafeBoundFunction[
        js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
      ]
    
    def queryAllByTitle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
              ReturnType[AllByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryAllByTitle")
    var queryAllByTitle_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
          ReturnType[AllByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def queryByAltText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
              ReturnType[QueryByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryByAltText")
    var queryByAltText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
          ReturnType[QueryByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def queryByDisplayValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
              ReturnType[QueryByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryByDisplayValue")
    var queryByDisplayValue_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
          ReturnType[QueryByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def queryByLabelText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[QueryByText_[HTMLElement]], 
              ReturnType[QueryByText_[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryByLabelText")
    var queryByLabelText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByText_[HTMLElement]], 
          ReturnType[QueryByText_[HTMLElement]]
        ]
      ]
    
    def queryByPlaceholderText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
              ReturnType[QueryByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryByPlaceholderText")
    var queryByPlaceholderText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
          ReturnType[QueryByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def queryByRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[QueryByRole_[HTMLElement]], 
              ReturnType[QueryByRole_[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryByRole")
    var queryByRole_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByRole_[HTMLElement]], 
          ReturnType[QueryByRole_[HTMLElement]]
        ]
      ]
    
    def queryByTestId(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
              ReturnType[QueryByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryByTestId")
    var queryByTestId_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
          ReturnType[QueryByBoundAttribute[HTMLElement]]
        ]
      ]
    
    def queryByText(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[QueryByText_[HTMLElement]], 
              ReturnType[QueryByText_[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryByText")
    var queryByText_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByText_[HTMLElement]], 
          ReturnType[QueryByText_[HTMLElement]]
        ]
      ]
    
    def queryByTitle(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<BoundFunction<T>> is not an array type */ params: Parameters[
          BoundFunction[
            js.Function1[
              /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
              ReturnType[QueryByBoundAttribute[HTMLElement]]
            ]
          ]
        ]
    ): SelectorPromise
    @JSName("queryByTitle")
    var queryByTitle_Original: TestcafeBoundFunction[
        js.Function1[
          /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
          ReturnType[QueryByBoundAttribute[HTMLElement]]
        ]
      ]
  }
  object WithinSelectors {
    
    extension [Self <: WithinSelectors](x: Self) {
      
      inline def setFindAllByAltText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
                  ReturnType[FindAllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findAllByAltText", js.Any.fromFunction1(value))
      
      inline def setFindAllByDisplayValue(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
                  ReturnType[FindAllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findAllByDisplayValue", js.Any.fromFunction1(value))
      
      inline def setFindAllByLabelText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindAllByText_[HTMLElement]], 
                  ReturnType[FindAllByText_[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findAllByLabelText", js.Any.fromFunction1(value))
      
      inline def setFindAllByPlaceholderText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
                  ReturnType[FindAllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findAllByPlaceholderText", js.Any.fromFunction1(value))
      
      inline def setFindAllByRole(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindAllByRole_[HTMLElement]], 
                  ReturnType[FindAllByRole_[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findAllByRole", js.Any.fromFunction1(value))
      
      inline def setFindAllByTestId(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
                  ReturnType[FindAllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findAllByTestId", js.Any.fromFunction1(value))
      
      inline def setFindAllByText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindAllByText_[HTMLElement]], 
                  ReturnType[FindAllByText_[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findAllByText", js.Any.fromFunction1(value))
      
      inline def setFindAllByTitle(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindAllByBoundAttribute[HTMLElement]], 
                  ReturnType[FindAllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findAllByTitle", js.Any.fromFunction1(value))
      
      inline def setFindByAltText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
                  ReturnType[FindByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findByAltText", js.Any.fromFunction1(value))
      
      inline def setFindByDisplayValue(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
                  ReturnType[FindByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findByDisplayValue", js.Any.fromFunction1(value))
      
      inline def setFindByLabelText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindByText_[HTMLElement]], 
                  ReturnType[FindByText_[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findByLabelText", js.Any.fromFunction1(value))
      
      inline def setFindByPlaceholderText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
                  ReturnType[FindByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findByPlaceholderText", js.Any.fromFunction1(value))
      
      inline def setFindByRole(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindByRole_[HTMLElement]], 
                  ReturnType[FindByRole_[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findByRole", js.Any.fromFunction1(value))
      
      inline def setFindByTestId(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
                  ReturnType[FindByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findByTestId", js.Any.fromFunction1(value))
      
      inline def setFindByText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindByText_[HTMLElement]], 
                  ReturnType[FindByText_[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findByText", js.Any.fromFunction1(value))
      
      inline def setFindByTitle(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[FindByBoundAttribute[HTMLElement]], 
                  ReturnType[FindByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "findByTitle", js.Any.fromFunction1(value))
      
      inline def setGetAllByAltText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
                  ReturnType[AllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getAllByAltText", js.Any.fromFunction1(value))
      
      inline def setGetAllByDisplayValue(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
                  ReturnType[AllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getAllByDisplayValue", js.Any.fromFunction1(value))
      
      inline def setGetAllByLabelText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getAllByLabelText", js.Any.fromFunction1(value))
      
      inline def setGetAllByPlaceholderText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
                  ReturnType[AllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getAllByPlaceholderText", js.Any.fromFunction1(value))
      
      inline def setGetAllByRole(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[/* args */ Parameters[AllByRole[HTMLElement]], ReturnType[AllByRole[HTMLElement]]]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getAllByRole", js.Any.fromFunction1(value))
      
      inline def setGetAllByTestId(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
                  ReturnType[AllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getAllByTestId", js.Any.fromFunction1(value))
      
      inline def setGetAllByText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getAllByText", js.Any.fromFunction1(value))
      
      inline def setGetAllByTitle(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
                  ReturnType[AllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getAllByTitle", js.Any.fromFunction1(value))
      
      inline def setGetByAltText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
                  ReturnType[GetByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getByAltText", js.Any.fromFunction1(value))
      
      inline def setGetByDisplayValue(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
                  ReturnType[GetByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getByDisplayValue", js.Any.fromFunction1(value))
      
      inline def setGetByLabelText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[GetByText_[HTMLElement]], 
                  ReturnType[GetByText_[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getByLabelText", js.Any.fromFunction1(value))
      
      inline def setGetByPlaceholderText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
                  ReturnType[GetByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getByPlaceholderText", js.Any.fromFunction1(value))
      
      inline def setGetByRole(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[GetByRole_[HTMLElement]], 
                  ReturnType[GetByRole_[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getByRole", js.Any.fromFunction1(value))
      
      inline def setGetByTestId(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
                  ReturnType[GetByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getByTestId", js.Any.fromFunction1(value))
      
      inline def setGetByText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[GetByText_[HTMLElement]], 
                  ReturnType[GetByText_[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getByText", js.Any.fromFunction1(value))
      
      inline def setGetByTitle(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[GetByBoundAttribute[HTMLElement]], 
                  ReturnType[GetByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "getByTitle", js.Any.fromFunction1(value))
      
      inline def setQueryAllByAltText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
                  ReturnType[AllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryAllByAltText", js.Any.fromFunction1(value))
      
      inline def setQueryAllByDisplayValue(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
                  ReturnType[AllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryAllByDisplayValue", js.Any.fromFunction1(value))
      
      inline def setQueryAllByLabelText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryAllByLabelText", js.Any.fromFunction1(value))
      
      inline def setQueryAllByPlaceholderText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
                  ReturnType[AllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryAllByPlaceholderText", js.Any.fromFunction1(value))
      
      inline def setQueryAllByRole(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[/* args */ Parameters[AllByRole[HTMLElement]], ReturnType[AllByRole[HTMLElement]]]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryAllByRole", js.Any.fromFunction1(value))
      
      inline def setQueryAllByTestId(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
                  ReturnType[AllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryAllByTestId", js.Any.fromFunction1(value))
      
      inline def setQueryAllByText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[/* args */ Parameters[AllByText[HTMLElement]], ReturnType[AllByText[HTMLElement]]]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryAllByText", js.Any.fromFunction1(value))
      
      inline def setQueryAllByTitle(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[AllByBoundAttribute[HTMLElement]], 
                  ReturnType[AllByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryAllByTitle", js.Any.fromFunction1(value))
      
      inline def setQueryByAltText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
                  ReturnType[QueryByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryByAltText", js.Any.fromFunction1(value))
      
      inline def setQueryByDisplayValue(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
                  ReturnType[QueryByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryByDisplayValue", js.Any.fromFunction1(value))
      
      inline def setQueryByLabelText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[QueryByText_[HTMLElement]], 
                  ReturnType[QueryByText_[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryByLabelText", js.Any.fromFunction1(value))
      
      inline def setQueryByPlaceholderText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
                  ReturnType[QueryByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryByPlaceholderText", js.Any.fromFunction1(value))
      
      inline def setQueryByRole(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[QueryByRole_[HTMLElement]], 
                  ReturnType[QueryByRole_[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryByRole", js.Any.fromFunction1(value))
      
      inline def setQueryByTestId(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
                  ReturnType[QueryByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryByTestId", js.Any.fromFunction1(value))
      
      inline def setQueryByText(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[QueryByText_[HTMLElement]], 
                  ReturnType[QueryByText_[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryByText", js.Any.fromFunction1(value))
      
      inline def setQueryByTitle(
        value: /* params */ Parameters[
              BoundFunction[
                js.Function1[
                  /* args */ Parameters[QueryByBoundAttribute[HTMLElement]], 
                  ReturnType[QueryByBoundAttribute[HTMLElement]]
                ]
              ]
            ] => SelectorPromise
      ): Self = StObject.set(x, "queryByTitle", js.Any.fromFunction1(value))
    }
  }
}
