package typingsJapgolly.webdriverio.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.NonNullable
import typingsJapgolly.webdriverio.webdriverioStrings.`object`
import typingsJapgolly.webdriverio.webdriverioStrings.boolean
import typingsJapgolly.webdriverio.webdriverioStrings.function
import typingsJapgolly.webdriverio.webdriverioStrings.number
import typingsJapgolly.webdriverio.webdriverioStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validate extends StObject {
  
  var default: js.UndefOr[
    (js.Function4[
      /* cid */ String, 
      /* exitCode */ Double, 
      /* specs */ js.Array[String], 
      /* retries */ Double, 
      Unit
    ]) | (js.Array[
      NonNullable[
        js.UndefOr[
          js.Function4[
            /* cid */ String, 
            /* exitCode */ Double, 
            /* specs */ js.Array[String], 
            /* retries */ Double, 
            Unit
          ]
        ]
      ]
    ])
  ] = js.undefined
  
  var `match`: js.UndefOr[js.RegExp] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: string | number | `object` | boolean | function
  
  var validate: js.UndefOr[
    js.Function1[
      /* option */ js.UndefOr[
        (js.Function4[
          /* cid */ String, 
          /* exitCode */ Double, 
          /* specs */ js.Array[String], 
          /* retries */ Double, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* cid */ String, 
                /* exitCode */ Double, 
                /* specs */ js.Array[String], 
                /* retries */ Double, 
                Unit
              ]
            ]
          ]
        ])
      ], 
      Unit
    ]
  ] = js.undefined
}
object Validate {
  
  inline def apply(`type`: string | number | `object` | boolean | function): Validate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validate]
  }
  
  extension [Self <: Validate](x: Self) {
    
    inline def setDefault(
      value: (js.Function4[
          /* cid */ String, 
          /* exitCode */ Double, 
          /* specs */ js.Array[String], 
          /* retries */ Double, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* cid */ String, 
                /* exitCode */ Double, 
                /* specs */ js.Array[String], 
                /* retries */ Double, 
                Unit
              ]
            ]
          ]
        ])
    ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultFunction4(
      value: (/* cid */ String, /* exitCode */ Double, /* specs */ js.Array[String], /* retries */ Double) => Callback
    ): Self = StObject.set(x, "default", js.Any.fromFunction4((t0: /* cid */ String, t1: /* exitCode */ Double, t2: /* specs */ js.Array[String], t3: /* retries */ Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(
      value: (NonNullable[
          js.UndefOr[
            js.Function4[
              /* cid */ String, 
              /* exitCode */ Double, 
              /* specs */ js.Array[String], 
              /* retries */ Double, 
              Unit
            ]
          ]
        ])*
    ): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: string | number | `object` | boolean | function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(
      value: /* option */ js.UndefOr[
          (js.Function4[
            /* cid */ String, 
            /* exitCode */ Double, 
            /* specs */ js.Array[String], 
            /* retries */ Double, 
            Unit
          ]) | (js.Array[
            NonNullable[
              js.UndefOr[
                js.Function4[
                  /* cid */ String, 
                  /* exitCode */ Double, 
                  /* specs */ js.Array[String], 
                  /* retries */ Double, 
                  Unit
                ]
              ]
            ]
          ])
        ] => Callback
    ): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: /* option */ js.UndefOr[
          (js.Function4[
            /* cid */ String, 
            /* exitCode */ Double, 
            /* specs */ js.Array[String], 
            /* retries */ Double, 
            Unit
          ]) | (js.Array[
            NonNullable[
              js.UndefOr[
                js.Function4[
                  /* cid */ String, 
                  /* exitCode */ Double, 
                  /* specs */ js.Array[String], 
                  /* retries */ Double, 
                  Unit
                ]
              ]
            ]
          ])
        ]) => value(t0).runNow()))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
