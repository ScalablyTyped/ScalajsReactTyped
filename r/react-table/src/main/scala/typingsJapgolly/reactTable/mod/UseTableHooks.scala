package typingsJapgolly.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait UseTableHooks[D /* <: js.Object */] extends StObject {
  
  var allColumns: js.Array[
    js.Function2[
      /* allColumns */ js.Array[ColumnInstance[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Column[D]]
    ]
  ]
  
  var allColumnsDeps: js.Array[
    js.Function2[
      /* deps */ js.Array[Any], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Any]
    ]
  ]
  
  var columns: js.Array[
    js.Function2[
      /* columns */ js.Array[Column[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Column[D]]
    ]
  ]
  
  var columnsDeps: js.Array[
    js.Function2[
      /* deps */ js.Array[Any], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Any]
    ]
  ]
  
  var getCellProps: js.Array[CellPropGetter[D]]
  
  var getFooterGroupProps: js.Array[FooterGroupPropGetter[D]]
  
  var getFooterProps: js.Array[FooterPropGetter[D]]
  
  var getHeaderGroupProps: js.Array[HeaderGroupPropGetter[D]]
  
  var getHeaderProps: js.Array[HeaderPropGetter[D]]
  
  var getRowProps: js.Array[RowPropGetter[D]]
  
  var getTableBodyProps: js.Array[TableBodyPropGetter[D]]
  
  var getTableProps: js.Array[TablePropGetter[D]]
  
  var headerGroups: js.Array[
    js.Function2[
      /* allColumns */ js.Array[HeaderGroup[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[HeaderGroup[D]]
    ]
  ]
  
  var headerGroupsDeps: js.Array[
    js.Function2[
      /* deps */ js.Array[Any], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Any]
    ]
  ]
  
  var prepareRow: js.Array[
    js.Function2[/* row */ Row[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], Unit]
  ]
  
  var stateReducers: js.Array[
    js.Function4[
      /* newState */ TableState[D], 
      /* action */ ActionType, 
      /* previousState */ js.UndefOr[TableState[D]], 
      /* instance */ js.UndefOr[TableInstance[D]], 
      js.UndefOr[ReducerTableState[D]]
    ]
  ]
  
  var useControlledState: js.Array[
    js.Function2[
      /* state */ TableState[D], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      TableState[D]
    ]
  ]
  
  var useFinalInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]
  
  var useInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]
  
  var useInstanceBeforeDimensions: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]
  
  var useOptions: js.Array[
    js.Function2[/* options */ TableOptions[D], /* args */ TableOptions[D], TableOptions[D]]
  ]
  
  var visibleColumns: js.Array[
    js.Function2[
      /* allColumns */ js.Array[ColumnInstance[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Column[D]]
    ]
  ]
  
  var visibleColumnsDeps: js.Array[
    js.Function2[
      /* deps */ js.Array[Any], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Any]
    ]
  ]
}
object UseTableHooks {
  
  inline def apply[D /* <: js.Object */](
    allColumns: js.Array[
      js.Function2[
        /* allColumns */ js.Array[ColumnInstance[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Column[D]]
      ]
    ],
    allColumnsDeps: js.Array[
      js.Function2[
        /* deps */ js.Array[Any], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Any]
      ]
    ],
    columns: js.Array[
      js.Function2[
        /* columns */ js.Array[Column[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Column[D]]
      ]
    ],
    columnsDeps: js.Array[
      js.Function2[
        /* deps */ js.Array[Any], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Any]
      ]
    ],
    getCellProps: js.Array[CellPropGetter[D]],
    getFooterGroupProps: js.Array[FooterGroupPropGetter[D]],
    getFooterProps: js.Array[FooterPropGetter[D]],
    getHeaderGroupProps: js.Array[HeaderGroupPropGetter[D]],
    getHeaderProps: js.Array[HeaderPropGetter[D]],
    getRowProps: js.Array[RowPropGetter[D]],
    getTableBodyProps: js.Array[TableBodyPropGetter[D]],
    getTableProps: js.Array[TablePropGetter[D]],
    headerGroups: js.Array[
      js.Function2[
        /* allColumns */ js.Array[HeaderGroup[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[HeaderGroup[D]]
      ]
    ],
    headerGroupsDeps: js.Array[
      js.Function2[
        /* deps */ js.Array[Any], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Any]
      ]
    ],
    prepareRow: js.Array[
      js.Function2[/* row */ Row[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], Unit]
    ],
    stateReducers: js.Array[
      js.Function4[
        /* newState */ TableState[D], 
        /* action */ ActionType, 
        /* previousState */ js.UndefOr[TableState[D]], 
        /* instance */ js.UndefOr[TableInstance[D]], 
        js.UndefOr[ReducerTableState[D]]
      ]
    ],
    useControlledState: js.Array[
      js.Function2[
        /* state */ TableState[D], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        TableState[D]
      ]
    ],
    useFinalInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]],
    useInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]],
    useInstanceBeforeDimensions: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]],
    useOptions: js.Array[
      js.Function2[/* options */ TableOptions[D], /* args */ TableOptions[D], TableOptions[D]]
    ],
    visibleColumns: js.Array[
      js.Function2[
        /* allColumns */ js.Array[ColumnInstance[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Column[D]]
      ]
    ],
    visibleColumnsDeps: js.Array[
      js.Function2[
        /* deps */ js.Array[Any], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Any]
      ]
    ]
  ): UseTableHooks[D] = {
    val __obj = js.Dynamic.literal(allColumns = allColumns.asInstanceOf[js.Any], allColumnsDeps = allColumnsDeps.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsDeps = columnsDeps.asInstanceOf[js.Any], getCellProps = getCellProps.asInstanceOf[js.Any], getFooterGroupProps = getFooterGroupProps.asInstanceOf[js.Any], getFooterProps = getFooterProps.asInstanceOf[js.Any], getHeaderGroupProps = getHeaderGroupProps.asInstanceOf[js.Any], getHeaderProps = getHeaderProps.asInstanceOf[js.Any], getRowProps = getRowProps.asInstanceOf[js.Any], getTableBodyProps = getTableBodyProps.asInstanceOf[js.Any], getTableProps = getTableProps.asInstanceOf[js.Any], headerGroups = headerGroups.asInstanceOf[js.Any], headerGroupsDeps = headerGroupsDeps.asInstanceOf[js.Any], prepareRow = prepareRow.asInstanceOf[js.Any], stateReducers = stateReducers.asInstanceOf[js.Any], useControlledState = useControlledState.asInstanceOf[js.Any], useFinalInstance = useFinalInstance.asInstanceOf[js.Any], useInstance = useInstance.asInstanceOf[js.Any], useInstanceBeforeDimensions = useInstanceBeforeDimensions.asInstanceOf[js.Any], useOptions = useOptions.asInstanceOf[js.Any], visibleColumns = visibleColumns.asInstanceOf[js.Any], visibleColumnsDeps = visibleColumnsDeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseTableHooks[D]]
  }
  
  extension [Self <: UseTableHooks[?], D /* <: js.Object */](x: Self & UseTableHooks[D]) {
    
    inline def setAllColumns(
      value: js.Array[
          js.Function2[
            /* allColumns */ js.Array[ColumnInstance[D]], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Column[D]]
          ]
        ]
    ): Self = StObject.set(x, "allColumns", value.asInstanceOf[js.Any])
    
    inline def setAllColumnsDeps(
      value: js.Array[
          js.Function2[
            /* deps */ js.Array[Any], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Any]
          ]
        ]
    ): Self = StObject.set(x, "allColumnsDeps", value.asInstanceOf[js.Any])
    
    inline def setAllColumnsDepsVarargs(
      value: (js.Function2[
          /* deps */ js.Array[Any], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[Any]
        ])*
    ): Self = StObject.set(x, "allColumnsDeps", js.Array(value*))
    
    inline def setAllColumnsVarargs(
      value: (js.Function2[
          /* allColumns */ js.Array[ColumnInstance[D]], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[Column[D]]
        ])*
    ): Self = StObject.set(x, "allColumns", js.Array(value*))
    
    inline def setColumns(
      value: js.Array[
          js.Function2[
            /* columns */ js.Array[Column[D]], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Column[D]]
          ]
        ]
    ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsDeps(
      value: js.Array[
          js.Function2[
            /* deps */ js.Array[Any], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Any]
          ]
        ]
    ): Self = StObject.set(x, "columnsDeps", value.asInstanceOf[js.Any])
    
    inline def setColumnsDepsVarargs(
      value: (js.Function2[
          /* deps */ js.Array[Any], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[Any]
        ])*
    ): Self = StObject.set(x, "columnsDeps", js.Array(value*))
    
    inline def setColumnsVarargs(
      value: (js.Function2[
          /* columns */ js.Array[Column[D]], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[Column[D]]
        ])*
    ): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setGetCellProps(value: js.Array[CellPropGetter[D]]): Self = StObject.set(x, "getCellProps", value.asInstanceOf[js.Any])
    
    inline def setGetCellPropsVarargs(value: CellPropGetter[D]*): Self = StObject.set(x, "getCellProps", js.Array(value*))
    
    inline def setGetFooterGroupProps(value: js.Array[FooterGroupPropGetter[D]]): Self = StObject.set(x, "getFooterGroupProps", value.asInstanceOf[js.Any])
    
    inline def setGetFooterGroupPropsVarargs(value: FooterGroupPropGetter[D]*): Self = StObject.set(x, "getFooterGroupProps", js.Array(value*))
    
    inline def setGetFooterProps(value: js.Array[FooterPropGetter[D]]): Self = StObject.set(x, "getFooterProps", value.asInstanceOf[js.Any])
    
    inline def setGetFooterPropsVarargs(value: FooterPropGetter[D]*): Self = StObject.set(x, "getFooterProps", js.Array(value*))
    
    inline def setGetHeaderGroupProps(value: js.Array[HeaderGroupPropGetter[D]]): Self = StObject.set(x, "getHeaderGroupProps", value.asInstanceOf[js.Any])
    
    inline def setGetHeaderGroupPropsVarargs(value: HeaderGroupPropGetter[D]*): Self = StObject.set(x, "getHeaderGroupProps", js.Array(value*))
    
    inline def setGetHeaderProps(value: js.Array[HeaderPropGetter[D]]): Self = StObject.set(x, "getHeaderProps", value.asInstanceOf[js.Any])
    
    inline def setGetHeaderPropsVarargs(value: HeaderPropGetter[D]*): Self = StObject.set(x, "getHeaderProps", js.Array(value*))
    
    inline def setGetRowProps(value: js.Array[RowPropGetter[D]]): Self = StObject.set(x, "getRowProps", value.asInstanceOf[js.Any])
    
    inline def setGetRowPropsVarargs(value: RowPropGetter[D]*): Self = StObject.set(x, "getRowProps", js.Array(value*))
    
    inline def setGetTableBodyProps(value: js.Array[TableBodyPropGetter[D]]): Self = StObject.set(x, "getTableBodyProps", value.asInstanceOf[js.Any])
    
    inline def setGetTableBodyPropsVarargs(value: TableBodyPropGetter[D]*): Self = StObject.set(x, "getTableBodyProps", js.Array(value*))
    
    inline def setGetTableProps(value: js.Array[TablePropGetter[D]]): Self = StObject.set(x, "getTableProps", value.asInstanceOf[js.Any])
    
    inline def setGetTablePropsVarargs(value: TablePropGetter[D]*): Self = StObject.set(x, "getTableProps", js.Array(value*))
    
    inline def setHeaderGroups(
      value: js.Array[
          js.Function2[
            /* allColumns */ js.Array[HeaderGroup[D]], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[HeaderGroup[D]]
          ]
        ]
    ): Self = StObject.set(x, "headerGroups", value.asInstanceOf[js.Any])
    
    inline def setHeaderGroupsDeps(
      value: js.Array[
          js.Function2[
            /* deps */ js.Array[Any], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Any]
          ]
        ]
    ): Self = StObject.set(x, "headerGroupsDeps", value.asInstanceOf[js.Any])
    
    inline def setHeaderGroupsDepsVarargs(
      value: (js.Function2[
          /* deps */ js.Array[Any], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[Any]
        ])*
    ): Self = StObject.set(x, "headerGroupsDeps", js.Array(value*))
    
    inline def setHeaderGroupsVarargs(
      value: (js.Function2[
          /* allColumns */ js.Array[HeaderGroup[D]], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[HeaderGroup[D]]
        ])*
    ): Self = StObject.set(x, "headerGroups", js.Array(value*))
    
    inline def setPrepareRow(
      value: js.Array[
          js.Function2[/* row */ Row[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], Unit]
        ]
    ): Self = StObject.set(x, "prepareRow", value.asInstanceOf[js.Any])
    
    inline def setPrepareRowVarargs(value: (js.Function2[/* row */ Row[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], Unit])*): Self = StObject.set(x, "prepareRow", js.Array(value*))
    
    inline def setStateReducers(
      value: js.Array[
          js.Function4[
            /* newState */ TableState[D], 
            /* action */ ActionType, 
            /* previousState */ js.UndefOr[TableState[D]], 
            /* instance */ js.UndefOr[TableInstance[D]], 
            js.UndefOr[ReducerTableState[D]]
          ]
        ]
    ): Self = StObject.set(x, "stateReducers", value.asInstanceOf[js.Any])
    
    inline def setStateReducersVarargs(
      value: (js.Function4[
          /* newState */ TableState[D], 
          /* action */ ActionType, 
          /* previousState */ js.UndefOr[TableState[D]], 
          /* instance */ js.UndefOr[TableInstance[D]], 
          js.UndefOr[ReducerTableState[D]]
        ])*
    ): Self = StObject.set(x, "stateReducers", js.Array(value*))
    
    inline def setUseControlledState(
      value: js.Array[
          js.Function2[
            /* state */ TableState[D], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            TableState[D]
          ]
        ]
    ): Self = StObject.set(x, "useControlledState", value.asInstanceOf[js.Any])
    
    inline def setUseControlledStateVarargs(
      value: (js.Function2[
          /* state */ TableState[D], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          TableState[D]
        ])*
    ): Self = StObject.set(x, "useControlledState", js.Array(value*))
    
    inline def setUseFinalInstance(value: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]): Self = StObject.set(x, "useFinalInstance", value.asInstanceOf[js.Any])
    
    inline def setUseFinalInstanceVarargs(value: (js.Function1[/* instance */ TableInstance[D], Unit])*): Self = StObject.set(x, "useFinalInstance", js.Array(value*))
    
    inline def setUseInstance(value: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]): Self = StObject.set(x, "useInstance", value.asInstanceOf[js.Any])
    
    inline def setUseInstanceBeforeDimensions(value: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]): Self = StObject.set(x, "useInstanceBeforeDimensions", value.asInstanceOf[js.Any])
    
    inline def setUseInstanceBeforeDimensionsVarargs(value: (js.Function1[/* instance */ TableInstance[D], Unit])*): Self = StObject.set(x, "useInstanceBeforeDimensions", js.Array(value*))
    
    inline def setUseInstanceVarargs(value: (js.Function1[/* instance */ TableInstance[D], Unit])*): Self = StObject.set(x, "useInstance", js.Array(value*))
    
    inline def setUseOptions(
      value: js.Array[
          js.Function2[/* options */ TableOptions[D], /* args */ TableOptions[D], TableOptions[D]]
        ]
    ): Self = StObject.set(x, "useOptions", value.asInstanceOf[js.Any])
    
    inline def setUseOptionsVarargs(value: (js.Function2[/* options */ TableOptions[D], /* args */ TableOptions[D], TableOptions[D]])*): Self = StObject.set(x, "useOptions", js.Array(value*))
    
    inline def setVisibleColumns(
      value: js.Array[
          js.Function2[
            /* allColumns */ js.Array[ColumnInstance[D]], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Column[D]]
          ]
        ]
    ): Self = StObject.set(x, "visibleColumns", value.asInstanceOf[js.Any])
    
    inline def setVisibleColumnsDeps(
      value: js.Array[
          js.Function2[
            /* deps */ js.Array[Any], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Any]
          ]
        ]
    ): Self = StObject.set(x, "visibleColumnsDeps", value.asInstanceOf[js.Any])
    
    inline def setVisibleColumnsDepsVarargs(
      value: (js.Function2[
          /* deps */ js.Array[Any], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[Any]
        ])*
    ): Self = StObject.set(x, "visibleColumnsDeps", js.Array(value*))
    
    inline def setVisibleColumnsVarargs(
      value: (js.Function2[
          /* allColumns */ js.Array[ColumnInstance[D]], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[Column[D]]
        ])*
    ): Self = StObject.set(x, "visibleColumns", js.Array(value*))
  }
}
