package typingsJapgolly.popoto.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofResult extends StObject {
  
  val RESULTS_PAGE_SIZE: Double
  
  val TOTAL_COUNT: Double
  
  val containerId: String
  
  def generatePreQuery(): Unit
  
  val graphResultListeners: js.Array[js.Function0[Unit]]
  
  val hasChanged: Boolean
  
  def onGraphResultReceived(listerner: js.Function1[/* graphResult */ Any, Unit]): Unit
  
  def onResultReceived(
    listerner: js.Function1[
      /* result */ js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N4jResult */ Any
      ], 
      Unit
    ]
  ): Unit
  
  /**
    * Register a listener to the result count event.
    * This listener will be called on evry result change with total result count.
    */
  def onTotalResultCount(listerner: js.Function1[/* count */ Double, Unit]): Unit
  
  /**
    * Parse REST returned Graph data and generate a list of nodes and edges.
    *
    * @param data
    * @returns an object with two keys: nodes, edges
    */
  def parseGraphResultData(data: Any): Edges
  
  val resultCountListeners: js.Array[js.Function1[/* count */ Double, Unit]]
  
  val resultListeners: js.Array[
    js.Function1[
      /* result */ js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N4jResult */ Any
      ], 
      Unit
    ]
  ]
  
  def updateResults(): Unit
  
  def updateResultsCount(): Unit
}
object TypeofResult {
  
  inline def apply(
    RESULTS_PAGE_SIZE: Double,
    TOTAL_COUNT: Double,
    containerId: String,
    generatePreQuery: Callback,
    graphResultListeners: js.Array[js.Function0[Unit]],
    hasChanged: Boolean,
    onGraphResultReceived: js.Function1[/* graphResult */ Any, Unit] => Callback,
    onResultReceived: js.Function1[
      /* result */ js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N4jResult */ Any
      ], 
      Unit
    ] => Callback,
    onTotalResultCount: js.Function1[/* count */ Double, Unit] => Callback,
    parseGraphResultData: Any => Edges,
    resultCountListeners: js.Array[js.Function1[/* count */ Double, Unit]],
    resultListeners: js.Array[
      js.Function1[
        /* result */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N4jResult */ Any
        ], 
        Unit
      ]
    ],
    updateResults: Callback,
    updateResultsCount: Callback
  ): TypeofResult = {
    val __obj = js.Dynamic.literal(RESULTS_PAGE_SIZE = RESULTS_PAGE_SIZE.asInstanceOf[js.Any], TOTAL_COUNT = TOTAL_COUNT.asInstanceOf[js.Any], containerId = containerId.asInstanceOf[js.Any], generatePreQuery = generatePreQuery.toJsFn, graphResultListeners = graphResultListeners.asInstanceOf[js.Any], hasChanged = hasChanged.asInstanceOf[js.Any], onGraphResultReceived = js.Any.fromFunction1((t0: js.Function1[/* graphResult */ Any, Unit]) => onGraphResultReceived(t0).runNow()), onResultReceived = js.Any.fromFunction1((t0: js.Function1[
      /* result */ js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N4jResult */ Any
      ], 
      Unit
    ]) => onResultReceived(t0).runNow()), onTotalResultCount = js.Any.fromFunction1((t0: js.Function1[/* count */ Double, Unit]) => onTotalResultCount(t0).runNow()), parseGraphResultData = js.Any.fromFunction1(parseGraphResultData), resultCountListeners = resultCountListeners.asInstanceOf[js.Any], resultListeners = resultListeners.asInstanceOf[js.Any], updateResults = updateResults.toJsFn, updateResultsCount = updateResultsCount.toJsFn)
    __obj.asInstanceOf[TypeofResult]
  }
  
  extension [Self <: TypeofResult](x: Self) {
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setGeneratePreQuery(value: Callback): Self = StObject.set(x, "generatePreQuery", value.toJsFn)
    
    inline def setGraphResultListeners(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "graphResultListeners", value.asInstanceOf[js.Any])
    
    inline def setGraphResultListenersVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "graphResultListeners", js.Array(value*))
    
    inline def setHasChanged(value: Boolean): Self = StObject.set(x, "hasChanged", value.asInstanceOf[js.Any])
    
    inline def setOnGraphResultReceived(value: js.Function1[/* graphResult */ Any, Unit] => Callback): Self = StObject.set(x, "onGraphResultReceived", js.Any.fromFunction1((t0: js.Function1[/* graphResult */ Any, Unit]) => value(t0).runNow()))
    
    inline def setOnResultReceived(
      value: js.Function1[
          /* result */ js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N4jResult */ Any
          ], 
          Unit
        ] => Callback
    ): Self = StObject.set(x, "onResultReceived", js.Any.fromFunction1((t0: js.Function1[
          /* result */ js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N4jResult */ Any
          ], 
          Unit
        ]) => value(t0).runNow()))
    
    inline def setOnTotalResultCount(value: js.Function1[/* count */ Double, Unit] => Callback): Self = StObject.set(x, "onTotalResultCount", js.Any.fromFunction1((t0: js.Function1[/* count */ Double, Unit]) => value(t0).runNow()))
    
    inline def setParseGraphResultData(value: Any => Edges): Self = StObject.set(x, "parseGraphResultData", js.Any.fromFunction1(value))
    
    inline def setRESULTS_PAGE_SIZE(value: Double): Self = StObject.set(x, "RESULTS_PAGE_SIZE", value.asInstanceOf[js.Any])
    
    inline def setResultCountListeners(value: js.Array[js.Function1[/* count */ Double, Unit]]): Self = StObject.set(x, "resultCountListeners", value.asInstanceOf[js.Any])
    
    inline def setResultCountListenersVarargs(value: (js.Function1[/* count */ Double, Unit])*): Self = StObject.set(x, "resultCountListeners", js.Array(value*))
    
    inline def setResultListeners(
      value: js.Array[
          js.Function1[
            /* result */ js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N4jResult */ Any
            ], 
            Unit
          ]
        ]
    ): Self = StObject.set(x, "resultListeners", value.asInstanceOf[js.Any])
    
    inline def setResultListenersVarargs(
      value: (js.Function1[
          /* result */ js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N4jResult */ Any
          ], 
          Unit
        ])*
    ): Self = StObject.set(x, "resultListeners", js.Array(value*))
    
    inline def setTOTAL_COUNT(value: Double): Self = StObject.set(x, "TOTAL_COUNT", value.asInstanceOf[js.Any])
    
    inline def setUpdateResults(value: Callback): Self = StObject.set(x, "updateResults", value.toJsFn)
    
    inline def setUpdateResultsCount(value: Callback): Self = StObject.set(x, "updateResultsCount", value.toJsFn)
  }
}
